package com.practica.adso.services;

import java.util.List;
import com.practica.adso.dto.UsuarioDto;

public interface UsuarioService {

    public UsuarioDto getUsuario(Integer usuarioid);
    
    public List<UsuarioDto> getUserDto();

    public UsuarioDto saveUsuario(UsuarioDto usaurioDto);

    public UsuarioDto deleteUser (Integer usarioid);

    public UsuarioDto updateUser (Integer usuarioid, UsuarioDto usuarioDto);

}
