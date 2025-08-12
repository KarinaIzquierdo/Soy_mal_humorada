package com.practica.adso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.practica.adso.models.Usuario;
import com.practica.adso.repositoryes.UsuarioRepositorio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepositorio UsRep;
    
@GetMapping("/conexion")
public String usuario_con() {
    return UsRep.findAll().toString();
    }

    @GetMapping ("/json")
    public List<Usuario> Usuarioslista() {
        return UsRep.findAll();
    }
    @PostMapping("/postuser")
    public Usuario creausuario(@RequestBody Usuario usuario) {
        return UsRep.save(usuario);
    }
    @DeleteMapping("/user/{id}")
    public String eliminausuario(@PathVariable Integer id ) {
        UsRep.deleteById(id);
        return"";
    }
    @PutMapping("actualizar/{id}")
    public String userupdate(@PathVariable String id, @RequestBody Usuario usuario) {
        Usuario userupdate = UsRep.findById(Integer.parseInt(id)).orElse(null);
        if (userupdate == null) {
            return "usuario no encontrado";
        }
        userupdate.setNombre (usuario.getNombre());
        userupdate.setApellido (usuario.getApellido());
        userupdate.setCiudad (usuario.getApellido());
        UsRep.save(userupdate);
        return"chimbo";
    }

}