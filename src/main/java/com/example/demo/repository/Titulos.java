package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {

}
