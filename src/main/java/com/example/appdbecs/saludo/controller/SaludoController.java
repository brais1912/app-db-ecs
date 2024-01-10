package com.example.appdbecs.saludo.controller;

import com.example.appdbecs.saludo.controller.dto.SaludoDTO;
import com.example.appdbecs.saludo.mapper.SaludoMapper;
import com.example.appdbecs.saludo.repository.SaludoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/saludo")
public class SaludoController {

    private final SaludoRepository saludoRepository;
    private final SaludoMapper saludoMapper;

    @GetMapping("/default-saludo")
    public SaludoDTO getDefaultSaludo() {
        return saludoMapper.toSaludoDTO(saludoRepository.findByIsDefaultTrue());
    }

    @GetMapping("/{id}")
    public SaludoDTO getSaludo(@PathVariable UUID id) {
        return saludoRepository.findById(id)
                .map(saludoMapper::toSaludoDTO)
                .orElse(null);
    }

    @GetMapping
    public List<SaludoDTO> getSaludos() {
        return saludoRepository.findAll().stream()
                .map(saludoMapper::toSaludoDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/nombre")
    public List<SaludoDTO> getSaludoByNombre(@RequestParam String nombre) {
        return saludoRepository.findAllByNombre(nombre).stream()
                .map(saludoMapper::toSaludoDTO)
                .collect(Collectors.toList());
    }

    @PostMapping
    public String addSaludo(@RequestBody SaludoDTO saludoDTO) {
        saludoRepository.save(saludoMapper.toSaludo(saludoDTO));
        return "Saludo added successfully";
    }
}
