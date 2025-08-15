package com.practica.adso.services;

import java.util.List;
import com.practica.adso.dto.ProductoDto;

public interface ProductoService {

    public ProductoDto getProDtoId(Integer productoDtoId);

    public List<ProductoDto> getProDtoList();

    public ProductoDto saveProductDto(ProductoDto productoDto);

    public ProductoDto deleteProductoDto(Integer productoID);

    public ProductoDto updateProductDto(Integer productoId, ProductoDto productoDto);

}
