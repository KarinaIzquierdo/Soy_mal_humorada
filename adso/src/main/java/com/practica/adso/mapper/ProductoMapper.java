package com.practica.adso.mapper;

import java.util.List;
import com.practica.adso.dto.ProductoDto;
import com.practica.adso.models.Producto;

public interface ProductoMapper {

    Producto toProducto (ProductoDto productoDto);
    ProductoDto toProductoDto (Producto producto);
    List<ProductoDto> toProductoDtoList (List<Producto> producto);
    void updateProductDto (Producto producto, ProductoDto productoDto);
}
