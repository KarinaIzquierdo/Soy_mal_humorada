package com.practica.adso.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.practica.adso.dto.UsuarioDto;
import com.practica.adso.mapper.UsuarioMapper;
import com.practica.adso.models.Usuario;
import com.practica.adso.repositoryes.UsuarioRepositorio;

public class UsuarioServiceImplement implements UsuarioService {
    @Autowired
    private UsuarioRepositorio UsRep;
    private UsuarioMapper UsMap;

    @Override
    public UsuarioDto getUsuario(Integer usuarioid) {
        Usuario usuario = UsRep.findById(usuarioid).get();
        return UsMap.toUsuarioDto(usuario);
    }
}
