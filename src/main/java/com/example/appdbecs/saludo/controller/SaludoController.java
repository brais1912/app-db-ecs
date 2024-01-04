package com.example.appdbecs.saludo.controller;

import com.example.appdbecs.saludo.domain.Saludo;
import com.example.appdbecs.saludo.repository.SaludoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @Autowired
    private SaludoRepository saludoRepository;

    @GetMapping("/default-saludo")
    public Saludo getDefaultSaludo() {
        return saludoRepository.findByIsDefaultTrue();
    }
}
