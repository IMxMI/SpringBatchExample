package com.example.springbatchexample.mapper.target;

import com.example.springbatchexample.dto.target.AchatNewDto;
import com.example.springbatchexample.entity.target.AchatNew;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {UtilisateurNewMapper.class, OrdinateurNewMapper.class})
public interface AchatNewMapper {
    AchatNew toEntity(AchatNewDto achatNewDto);

    AchatNewDto toDto(AchatNew achatNew);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AchatNew partialUpdate(AchatNewDto achatNewDto, @MappingTarget AchatNew achatNew);
}