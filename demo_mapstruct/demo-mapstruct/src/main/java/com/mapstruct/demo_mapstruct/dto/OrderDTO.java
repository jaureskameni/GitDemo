package com.mapstruct.demo_mapstruct.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Long id;
    private CustomerDTO customer;
    private List<ProductDTO> products;
}
