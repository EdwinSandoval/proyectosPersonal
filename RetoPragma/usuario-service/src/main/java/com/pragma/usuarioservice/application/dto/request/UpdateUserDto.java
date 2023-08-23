package com.pragma.usuarioservice.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUserDto {

    private Long id;

    private String nombre;

    private String apellido;
}
