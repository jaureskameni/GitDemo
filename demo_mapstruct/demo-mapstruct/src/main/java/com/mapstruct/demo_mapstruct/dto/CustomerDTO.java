package com.mapstruct.demo_mapstruct.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private Integer id;
    private String fullName;
    private String email;
    private String phone;
}
