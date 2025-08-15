package com.practica.adso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.adso.dto.UsuarioDto;
import com.practica.adso.mapper.UsuarioMapper;
import com.practica.adso.models.Usuario;
import com.practica.adso.repositoryes.UsuarioRepositorio;

@Service
public class UsuarioServiceImplement implements UsuarioService {

    @Autowired
    private UsuarioRepositorio UsRep;

    @Autowired
    private UsuarioMapper UsMap;

    @Override
    public UsuarioDto getUsuario(Integer usuarioid) {
        Usuario usuario = UsRep.findById(usuarioid).get();
        return UsMap.toUsuarioDto(usuario);
    }

    @Override 
    public UsuarioDto saveUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = UsMap.toUsuario(usuarioDto);
        return UsMap.toUsuarioDto(UsRep.save(usuario));
    }

    @Override
    public List <UsuarioDto> getUserDto (){
        List<Usuario> usuario = UsRep.findAll();
        return UsMap.toUsuarioDtoList(usuario);
}

    @Override
public UsuarioDto deleteUser (Integer usuarioid) {
    Usuario usuario = UsRep.findById(usuarioid).get();
    UsRep.delete(usuario);
    return UsMap.toUsuarioDto(usuario);
}
    @Override
    public UsuarioDto updateUser (Integer usuarioid, UsuarioDto usuarioDto) {
        Usuario usuario = UsRep.findById(usuarioid) .get();
        UsMap.updateUser(usuario, usuarioDto);
        return UsMap.toUsuarioDto(UsRep.save(usuario));
    }
}