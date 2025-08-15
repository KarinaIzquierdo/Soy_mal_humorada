package com.practica.adso.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.practica.adso.dto.ProductoDto;
import com.practica.adso.models.Producto;

@Component
public class ProductoMapperImplement implements ProductoMapper{

    @Override
    public Producto toProducto(ProductoDto productoDto) {
        if (productoDto == null) {
            return null;
        }
        Producto producto = new Producto();
        producto.setId_producto(productoDto.getId());
        producto.setNombre(productoDto.getNom());
        producto.setCategoria(productoDto.getCat());
        producto.setPrecio(productoDto.getPre());
        return producto;
    }

    @Override
    public ProductoDto toProductoDto (Producto producto) {
        if (producto == null) {
            return null;
        }
        ProductoDto productoDto = new ProductoDto();
        productoDto.setId(producto.getId_producto());
        productoDto.setNom(producto.getNombre());
        productoDto.setCat(producto.getCategoria());
        productoDto.setPre(producto.getPrecio());
        return productoDto;
    }

    @Override
    public List<ProductoDto> toProductoDtoList (List<Producto> productos) {
        if (productos == null) {
            return List.of();
        }

        List<ProductoDto> list = new ArrayList<ProductoDto>(productos.size());
        for(Producto producto : productos) {
            list.add(toProductoDto(producto));
        }
        return list;
    }

    @Override 
    public void updateProductDto (Producto producto, ProductoDto productoDto) {
        if (productoDto == null) {
            return;
        }
        producto.setNombre(productoDto.getNom());
        producto.setCategoria(productoDto.getCat());
        producto.setPrecio(productoDto.getPre());
    }

}
