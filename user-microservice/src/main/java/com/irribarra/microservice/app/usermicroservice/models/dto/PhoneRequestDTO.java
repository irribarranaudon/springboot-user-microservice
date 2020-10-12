package com.irribarra.microservice.app.usermicroservice.models.dto;

import lombok.Data;

@Data
public class PhoneRequestDTO {
    private String number;
    private String cityCode;
    private String countryCode;
}
