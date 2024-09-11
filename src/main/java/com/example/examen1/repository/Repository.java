package com.example.examen1.repository;

import com.example.examen1.models.Anuncios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Anuncios, Long> {
}
