package com.practica.adso.repositoryes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practica.adso.models.Producto;

public interface ProductoRepositorio extends JpaRepository <Producto, Integer>{
    List<Producto> findByCategoria(String categoria);
}
