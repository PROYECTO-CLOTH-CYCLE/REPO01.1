package com.upao.clothcycle.Cloth._Cycle._API.service;

import com.upao.clothcycle.api.entity.CarritodeCompras;
import com.upao.clothcycle.api.repository.CarritodeComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarritodeComprasService {

    private final CarritodeComprasRepository carritoRepository;

    @Autowired
    public CarritodeComprasService(CarritodeComprasRepository carritoRepository) {
        this.carritoRepository = carritoRepository;
    }

    public CarritodeCompras guardarCarrito(CarritodeCompras carrito) {
        return carritoRepository.save(carrito);
    }

    public Optional<CarritodeCompras> obtenerCarritoPorId(Long id) {
        return carritoRepository.findById(id);
    }

    public String realizarPago(CarritodeCompras carrito) {
        double total = calcularTotal(carrito);
        String enlacePayPal = generarEnlacePayPal(total);
        return enlacePayPal;
    }

    private double calcularTotal(CarritodeCompras carrito) {
        double total = 0.0;

        // Sumar los precios de los productos en el carrito
        for (Producto producto : carrito.getProductos()) {
            total += producto.getPrecio();
        }

        return total;
    }}