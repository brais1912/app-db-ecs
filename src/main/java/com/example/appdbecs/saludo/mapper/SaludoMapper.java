package com.example.appdbecs.saludo.mapper;

import com.example.appdbecs.saludo.controller.dto.SaludoDTO;
import com.example.appdbecs.saludo.domain.Saludo;
import org.mapstruct.Mapper;

@Mapper
public interface SaludoMapper {

    SaludoDTO toSaludoDTO(Saludo saludo);
    Saludo toSaludo(SaludoDTO saludoDTO);
}
