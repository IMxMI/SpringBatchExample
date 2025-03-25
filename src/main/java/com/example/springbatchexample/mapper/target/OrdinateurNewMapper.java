package com.example.springbatchexample.mapper.target;

import com.example.springbatchexample.dto.target.OrdinateurNewDto;
import com.example.springbatchexample.entity.target.OrdinateurNew;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)public interface OrdinateurNewMapper {
    OrdinateurNew toEntity(OrdinateurNewDto ordinateurNewDto);

    @AfterMapping
    default void linkRams(@MappingTarget OrdinateurNew ordinateurNew) {
        ordinateurNew.getRams().forEach(ram -> ram.setOrdinateurUuid(ordinateurNew));
    }

    OrdinateurNewDto toDto(OrdinateurNew ordinateurNew);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)OrdinateurNew partialUpdate(OrdinateurNewDto ordinateurNewDto, @MappingTarget OrdinateurNew ordinateurNew);
}