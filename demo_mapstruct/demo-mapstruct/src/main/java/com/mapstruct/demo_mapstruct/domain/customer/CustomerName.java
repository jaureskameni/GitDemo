package com.mapstruct.demo_mapstruct.domain.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerName {
    private String firstName;
    private String lastName;
}
