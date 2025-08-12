package com.practica.adso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.practica.adso.models.Producto;
import com.practica.adso.models.Usuario;
import com.practica.adso.repositoryes.ProductoRepositorio;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class ProductoController {
    @Autowired
    private ProductoRepositorio ProRep;

@GetMapping ("/ConsulPro")
public String UserConsul () {
    return ProRep.findAll().toString();
}
@GetMapping ("/consultar")
public List<Producto> productoslist (){
    return ProRep.findAll();

}

@PostMapping ("/CrearPro")
public Producto crearProducto (@RequestBody Producto producto){
return ProRep.save (producto);

}

@DeleteMapping("/eliminar/{id}")
public String eliminarProducto(@PathVariable Integer id){
    ProRep.deleteById(id);
    return"usuario eliminado con exito";
}

@PutMapping("path/{id}")
public String productoupdate(@PathVariable String id, @RequestBody Producto producto) {
    Producto proupdate = ProRep.findById (Integer.parseInt(id)).orElse(null);
    if (proupdate == null) {
    return "usuario no encontrado";
    }
    proupdate.setNombre (producto.getNombre());
    proupdate.setCategoria (producto.getCategoria());
    proupdate.setPrecio (producto.getPrecio());
    ProRep.save(proupdate);
    return"listo mi papacho";
}

@GetMapping("/consultarcat/{categoria}")
public List<Producto> catef(@PathVariable String categoria) {
return ProRep.findByCategoria(categoria);
}
}

