package com.practica.adso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.practica.adso.dto.ProductoDto;
import com.practica.adso.models.Producto;
import com.practica.adso.models.Usuario;
import com.practica.adso.repositoryes.ProductoRepositorio;
import com.practica.adso.services.ProductoService;

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

//llamado de metodos en capitas
@Autowired
private ProductoService ProductServis;

@GetMapping("/GetProductDtoId/{id}")
public ResponseEntity<ProductoDto> getProductId (@PathVariable Integer id) {
    return new ResponseEntity<>(ProductServis.getProDtoId(id),HttpStatus.OK);
}

@PostMapping("PostProductDto")
public ResponseEntity<ProductoDto> postProductDto(@RequestBody ProductoDto productoDto) {
    return new ResponseEntity<>(ProductServis.saveProductDto(productoDto), HttpStatus.CREATED);
}

@GetMapping("GetProductDtoList")
public ResponseEntity<List<ProductoDto>> getProductList() {
    return new ResponseEntity<>(ProductServis.getProDtoList(), HttpStatus.OK);
}
}








