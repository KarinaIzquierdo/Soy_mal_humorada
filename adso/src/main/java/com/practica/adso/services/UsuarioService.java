package com.practica.adso.services;

import java.util.List;

import com.practica.adso.dto.UsuarioDto;

public interface UsuarioService {

    public UsuarioDto getUsuario(Integer usuarioid);
    
    public UsuarioDto saveUsuario(UsuarioDto usaurioDto);

    public List<UsuarioDto> getUserDto();

    public UsuarioDto deleteUser (Integer usarioid);
}
