package com.example.springbatchexample.batch.config;

import com.example.springbatchexample.batch.processor.OrdinateurItemProcessor;
import com.example.springbatchexample.entity.source.Ordinateur;
import com.example.springbatchexample.entity.target.OrdinateurNew;
import com.example.springbatchexample.repository.source.OrdinateurRepository;
import com.example.springbatchexample.repository.target.OrdinateurNewRepository;
import jakarta.transaction.Transactional;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemReader;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.data.builder.RepositoryItemReaderBuilder;
import org.springframework.batch.item.data.builder.RepositoryItemWriterBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.Collections;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Bean
    public RepositoryItemReader<Ordinateur> reader(OrdinateurRepository repository) {
        return new RepositoryItemReaderBuilder<Ordinateur>()
                .name("ordinateurItemReader")
                .repository(repository)
                .methodName("findAll")
                .sorts(Collections.singletonMap("id", Sort.Direction.ASC))
                .build();
    }

    @Bean
    public OrdinateurItemProcessor processor() {
        return new OrdinateurItemProcessor();
    }

    @Bean
    public RepositoryItemWriter<OrdinateurNew> writer(OrdinateurNewRepository repository) {

        return new RepositoryItemWriterBuilder<OrdinateurNew>()
                .repository(repository)
                .methodName("save")
                .build();
    }

    @Bean
    public Job importUserJob(JobRepository jobRepository, Step step1) {
        return new JobBuilder("importUserJob", jobRepository)
                .start(step1)
                .build();
    }

    @Bean
    public Step step1(JobRepository jobRepository, DataSourceTransactionManager transactionManager,
                      RepositoryItemReader<Ordinateur> reader, OrdinateurItemProcessor processor, RepositoryItemWriter<OrdinateurNew> writer) {
        return new StepBuilder("step1", jobRepository)
                .<Ordinateur, OrdinateurNew>chunk(3, transactionManager)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }
}
