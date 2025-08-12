package com.practica.adso.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practica.adso.models.Usuario;

public interface UsuarioRepositorio extends JpaRepository <Usuario, Integer> {

}
