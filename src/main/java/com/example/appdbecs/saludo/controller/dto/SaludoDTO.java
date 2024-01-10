package com.example.appdbecs.saludo.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class SaludoDTO {
    private UUID id;
    private String saludo;
    private String nombre;
    private boolean isDefault;
}
