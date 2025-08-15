package com.practica.adso.mapper;

import java.util.List;
import com.practica.adso.dto.UsuarioDto;
import com.practica.adso.models.Usuario;

public interface UsuarioMapper {

    Usuario toUsuario (UsuarioDto usuarioDto);
    UsuarioDto toUsuarioDto (Usuario usuario);
    List<UsuarioDto> toUsuarioDtoList (List<Usuario> usuarios); 
    void updateUser (Usuario usuario, UsuarioDto usuarioDto);
}
