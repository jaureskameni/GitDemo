package com.mapstruct.demo_mapstruct.dto;

import lombok.Getter;

@Getter
public enum CurrencyDTO {
    XAF("XAF"),
    EUR("EUR");

    private final String value;

    CurrencyDTO(String value) {
        this.value = value;
    }

}
