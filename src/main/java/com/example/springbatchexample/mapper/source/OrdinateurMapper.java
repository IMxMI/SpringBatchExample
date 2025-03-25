package com.example.springbatchexample.mapper.source;

import com.example.springbatchexample.dto.source.OrdinateurDto;
import com.example.springbatchexample.entity.source.Ordinateur;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OrdinateurMapper {
    Ordinateur toEntity(OrdinateurDto ordinateurDto);

    OrdinateurDto toDto(Ordinateur ordinateur);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Ordinateur partialUpdate(OrdinateurDto ordinateurDto, @MappingTarget Ordinateur ordinateur);
}