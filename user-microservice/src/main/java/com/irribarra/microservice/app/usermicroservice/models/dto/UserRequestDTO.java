package com.irribarra.microservice.app.usermicroservice.models.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserRequestDTO {
    private String name;
    private String email;
    private String password;
    private List<PhoneRequestDTO> phones;
}
