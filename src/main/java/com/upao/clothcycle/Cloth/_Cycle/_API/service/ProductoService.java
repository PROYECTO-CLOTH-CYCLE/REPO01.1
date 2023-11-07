package com.upao.clothcycle.Cloth._Cycle._API.service;
import com.upao.clothcycle.Cloth._Cycle._API.repository.ProductoRepository;
import com.upao.clothcycle.Cloth._Cycle._API.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    public Producto getProductoById(Long productoId) {
        return productoRepository.findById(productoId).orElse(null);
    }

    public Producto createProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto updateProducto(Long productoId, Producto producto) {
        if (productoRepository.existsById(productoId)) {
            producto.setProductoId(productoId);
            return productoRepository.save(producto);
        }
        return null; // Devuelve nulo si el producto no existe.
    }

    public void deleteProducto(Long productoId) {
        productoRepository.deleteById(productoId);
    }
}
