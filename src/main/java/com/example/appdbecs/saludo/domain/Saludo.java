package com.example.appdbecs.saludo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "saludo")
public class Saludo implements Serializable, Persistable<UUID> {

    @Id
    @GeneratedValue
    private UUID id;
    private String saludo;
    private String nombre;
    @Column(name = "default_saludo")
    private boolean isDefault;

    @Override
    public boolean isNew() {
        return false;
    }
}
