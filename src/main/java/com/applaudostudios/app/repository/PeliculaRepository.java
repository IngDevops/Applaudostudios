package com.applaudostudios.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applaudostudios.app.modelo.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

   List<Pelicula> findBytitulo(String titulo);

}
