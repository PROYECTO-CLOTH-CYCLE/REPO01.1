package com.upao.clothcycle.Cloth._Cycle._API.controller;

import com.upao.clothcycle.Cloth._Cycle._API.entity.Producto;
import com.upao.clothcycle.Cloth._Cycle._API.repository.ProductoRepository;
import com.upao.clothcycle.Cloth._Cycle._API.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@RestController
@RequestMapping("productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }

    @GetMapping("/{productoId}")
    public Producto getProductoById(@PathVariable Long productoId) {
        return productoService.getProductoById(productoId);
    }

    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productoService.createProducto(producto);
    }

    @PutMapping("/{productoId}")
    public Producto updateProducto(@PathVariable Long productoId, @RequestBody Producto producto) {
        return productoService.updateProducto(productoId, producto);
    }

    @DeleteMapping("/{productoId}")
    public void deleteProducto(@PathVariable Long productoId) {
        productoService.deleteProducto(productoId);
    }
}