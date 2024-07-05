package com.mapstruct.demo_mapstruct.domain.product;

import com.mapstruct.demo_mapstruct.domain.Money;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private ProductId id;
    private ProductName name;
    private Money price;
}
