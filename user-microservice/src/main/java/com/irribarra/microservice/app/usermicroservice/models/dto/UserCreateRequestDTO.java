package com.irribarra.microservice.app.usermicroservice.models.dto;

import lombok.Data;

@Data
public class UserCreateRequestDTO extends UserRequestDTO{
    private String password;
}
