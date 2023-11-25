package com.upao.proyecto.service;
import com.upao.proyecto.entity.Producto;
import com.upao.proyecto.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> getAllProducto(){
        return productoRepository.findAll();
    }

    public Optional<Producto> getProductoByNombre(String productoNombre) {
        return productoRepository.findByNombre(productoNombre);
    }

    public void addProducto(Producto producto){
        productoRepository.save(producto);
    }

    public void updateProducto(Producto producto, String productoNombre){
        Producto productoExists = productoRepository.findByNombre(productoNombre)
                .orElse(new Producto());
        productoExists.setNombre(producto.getNombre());
        productoExists.setPrecio(producto.getPrecio());
        productoExists.setCantidadDisponible(producto.getCantidadDisponible());
        productoExists.setDescripcion(producto.getDescripcion());
        productoRepository.save(productoExists);
    }

    public void deleteProductoByNombre(String productoNombre){
        productoRepository.deleteByNombre(productoNombre);
    }
}