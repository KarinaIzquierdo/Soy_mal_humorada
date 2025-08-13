package com.practica.adso.mapper;

import com.practica.adso.dto.UsuarioDto;
import com.practica.adso.models.Usuario;

public interface UsuarioMapper {

    Usuario toUsuario (UsuarioDto usuarioDto);
    UsuarioDto toUsuarioDto (Usuario usuario);
}
