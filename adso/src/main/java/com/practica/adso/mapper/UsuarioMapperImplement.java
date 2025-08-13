package com.practica.adso.mapper;

import org.springframework.stereotype.Component;

import com.practica.adso.dto.UsuarioDto;
import com.practica.adso.models.Usuario;

@Component
public class UsuarioMapperImplement implements UsuarioMapper{
    @Override
    public Usuario toUsuario (UsuarioDto usuarioDto) {
        if (usuarioDto == null) {
            return null;
        }
        Usuario usuario = new Usuario();
        usuario.setId_usuario(usuarioDto.getId_usuario());
        usuario.setNombre(usuarioDto.getNombre());
        usuario.setApellido(usuario.getApellido());
        usuario.setCiudad(usuario.getCiudad());
        return usuario;
    }
    
    @Override
    public UsuarioDto toUsuarioDto (Usuario usuario) {
        if (usuario == null) {
            return null;
        }

        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setId_usuario(usuario.getId_usuario());
        usuarioDto.setNombre(usuario.getNombre()); 
        usuarioDto.setApellido(usuario.getApellido());
        usuarioDto.setCiudad(usuario.getCiudad());
        return usuarioDto;
    }
}
