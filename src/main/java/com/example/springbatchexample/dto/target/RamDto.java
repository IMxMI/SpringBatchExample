package com.example.springbatchexample.dto.target;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.example.springbatchexample.entity.target.Ram}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RamDto implements Serializable {
    UUID id;
    Integer value;
}