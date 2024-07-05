package com.mapstruct.demo_mapstruct.domain;

import lombok.Getter;

@Getter
public enum Currency {
    XAF("XAF"),
    EUR("EUR"),
    USD("USD");

    private final String value;


    Currency(String value) {
        this.value = value;
    }
}
