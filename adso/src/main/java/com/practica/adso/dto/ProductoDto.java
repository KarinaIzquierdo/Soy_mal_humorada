package com.practica.adso.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductoDto {
    
    private Integer id;
    private String nom;
    private String cat;
    private Integer pre;
}
