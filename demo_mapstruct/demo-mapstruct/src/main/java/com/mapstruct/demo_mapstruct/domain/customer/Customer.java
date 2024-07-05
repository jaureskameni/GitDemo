package com.mapstruct.demo_mapstruct.domain.customer;

import com.mapstruct.demo_mapstruct.domain.PhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private CustomerId id;
    private CustomerName name;
    private PhoneNumber phoneNumber;
}
