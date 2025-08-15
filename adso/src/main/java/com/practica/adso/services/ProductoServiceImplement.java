package com.practica.adso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.adso.dto.ProductoDto;
import com.practica.adso.mapper.ProductoMapper;
import com.practica.adso.models.Producto;
import com.practica.adso.repositoryes.ProductoRepositorio;

@Service
public class ProductoServiceImplement implements ProductoService{

    @Autowired
    private ProductoRepositorio ProRep;

    @Autowired
    private ProductoMapper ProMap;

    @Override
    public ProductoDto getProDtoId(Integer productoDtoId) {
        Producto producto = ProRep.findById(productoDtoId).get();
        return  ProMap.toProductoDto(producto);
    }
    
    @Override
    public ProductoDto saveProductDto(ProductoDto productoDto) {
        Producto producto = ProMap.toProducto(productoDto);
        return ProMap.toProductoDto(ProRep.save(producto));
    }

    @Override
    public List<ProductoDto> getProDtoList() {
        List<Producto> producto = ProRep.findAll();
        return ProMap.toProductoDtoList(producto);
    }

    @Override
    public ProductoDto deleteProductoDto (Integer productoID) {
        Producto producto = ProRep.findById(productoID).get();
        ProRep.delete(producto);
        return ProMap.toProductoDto(producto);
    }

    @Override
    public ProductoDto updateProductDto (Integer productoId, ProductoDto productoDto){
        Producto producto = ProRep.findById(productoId).get();
        ProMap.updateProductDto(producto, productoDto);
        return ProMap.toProductoDto(ProRep.save(producto));
    }
}
