package com.irribarra.microservice.app.usermicroservice.models.dto;

import lombok.Data;

@Data
public class UserUpdateRequestDTO extends UserRequestDTO {
    private Boolean isActive;
}
