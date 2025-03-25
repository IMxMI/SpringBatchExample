package com.example.springbatchexample.mapper.source;

import com.example.springbatchexample.dto.source.AchatDto;
import com.example.springbatchexample.entity.source.Achat;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {UtilisateurMapper.class, OrdinateurMapper.class})
public interface AchatMapper {
    Achat toEntity(AchatDto achatDto);

    AchatDto toDto(Achat achat);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Achat partialUpdate(AchatDto achatDto, @MappingTarget Achat achat);
}