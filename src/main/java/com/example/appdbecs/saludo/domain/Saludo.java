package com.example.appdbecs.saludo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    private UUID id;
    private String saludo;
    private String nombre;
    @Column(name = "default_saludo")
    private boolean isDefault;

    @Override
    public boolean isNew() {
        return false;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
