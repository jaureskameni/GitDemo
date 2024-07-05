package com.mapstruct.demo_mapstruct.domain.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductName {
    String publicName;
    String technicalName;
}
