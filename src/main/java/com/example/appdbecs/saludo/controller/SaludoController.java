package com.example.appdbecs.saludo.controller;

import com.example.appdbecs.saludo.controller.dto.SaludoDTO;
import com.example.appdbecs.saludo.domain.Saludo;
import com.example.appdbecs.saludo.repository.SaludoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/saludo")
public class SaludoController {

    @Autowired
    private SaludoRepository saludoRepository;

    @GetMapping("/default-saludo")
    public Saludo getDefaultSaludo() {
        return saludoRepository.findByIsDefaultTrue();
    }

    @GetMapping("/{id}")
    public Saludo getSaludo(@PathVariable UUID id) {
        return saludoRepository.findAllById(List.of(id)).get(0);
    }

    @GetMapping
    public List<Saludo> getSaludos() {
        return saludoRepository.findAll();
    }

    @GetMapping("/nombre")
    public List<Saludo> getSaludoByNombre(@RequestParam String nombre) {
        return saludoRepository.findAllByNombre(nombre);
    }

    @PostMapping
    public String addSaludo(@RequestBody SaludoDTO saludoDTO) {
        saludoRepository.save(Saludo.builder()
                .saludo(saludoDTO.getSaludo())
                .nombre(saludoDTO.getNombre())
                .isDefault(saludoDTO.isDefault())
                .build());
        return "OK";
    }
}
