package com.example.appdbecs.saludo.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class SaludoDTO {
    private String saludo;
    private String nombre;
    private boolean isDefault;
}
