package com.example.springbatchexample.dto.target;

import lombok.*;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

/**
 * DTO for {@link com.example.springbatchexample.entity.target.OrdinateurNew}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrdinateurNewDto implements Serializable {
    UUID id;
    String label;
    Set<RamDto> rams;
}