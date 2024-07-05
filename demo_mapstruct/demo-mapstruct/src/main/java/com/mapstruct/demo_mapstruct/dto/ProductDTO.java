package com.mapstruct.demo_mapstruct.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class    ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private CurrencyDTO currency;
}
