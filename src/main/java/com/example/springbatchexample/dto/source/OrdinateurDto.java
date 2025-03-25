package com.example.springbatchexample.dto.source;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.example.springbatchexample.entity.source.Ordinateur}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrdinateurDto implements Serializable {
    Integer id;
    String label;
    Integer ram1;
    Integer ram2;
    Integer ram3;
    Integer ram4;
}