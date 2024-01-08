package com.example.appdbecs.saludo.repository;

import com.example.appdbecs.saludo.domain.Saludo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SaludoRepository extends JpaRepository<Saludo, UUID> {

    Saludo findByIsDefaultTrue();
    List<Saludo> findAllByNombre(String nombre);

}
