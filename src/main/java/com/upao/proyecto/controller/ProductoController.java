package com.upao.proyecto.controller;

import com.upao.proyecto.entity.Producto;
import com.upao.proyecto.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.getAllProducto();
    }

    @GetMapping("/{productoNombre}")
    public Producto getProductoByNombre(@PathVariable String productoNombre) {
        return productoService.getProductoByNombre(productoNombre)
                .orElse(new Producto());
    }

    @PostMapping
    public void addProducto(@RequestBody Producto producto) {
        productoService.addProducto(producto);
    }

    @PutMapping("/{productoNombre}")
    public void updateProducto(@RequestBody Producto producto, @PathVariable String productoNombre) {
        productoService.updateProducto(producto, productoNombre);
    }

    @DeleteMapping("/{productoNombre}")
    public void deleteProductoByNombre(@PathVariable String productoNombre) {
        productoService.deleteProductoByNombre(productoNombre);
    }
}