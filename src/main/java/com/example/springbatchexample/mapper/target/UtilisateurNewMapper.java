package com.example.springbatchexample.mapper.target;

import com.example.springbatchexample.dto.target.UtilisateurNewDto;
import com.example.springbatchexample.entity.target.UtilisateurNew;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UtilisateurNewMapper {
    UtilisateurNew toEntity(UtilisateurNewDto utilisateurNewDto);

    UtilisateurNewDto toDto(UtilisateurNew utilisateurNew);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    UtilisateurNew partialUpdate(UtilisateurNewDto utilisateurNewDto, @MappingTarget UtilisateurNew utilisateurNew);
}