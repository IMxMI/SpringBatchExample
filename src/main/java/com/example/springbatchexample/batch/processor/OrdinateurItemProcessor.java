package com.example.springbatchexample.batch.processor;

import com.example.springbatchexample.entity.source.Ordinateur;
import com.example.springbatchexample.entity.target.OrdinateurNew;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class OrdinateurItemProcessor implements ItemProcessor<Ordinateur, OrdinateurNew> {
    private static final Logger log = LoggerFactory.getLogger(OrdinateurItemProcessor.class);

    @Override
    public OrdinateurNew process(Ordinateur ordinateur) throws Exception {
        final OrdinateurNew transformedOrdinateur = new OrdinateurNew();
        transformedOrdinateur.setLabel(ordinateur.getLabel());

        return transformedOrdinateur;
    }

}
