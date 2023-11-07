package com.upao.clothcycle.Cloth._Cycle._API.controller;

import com.upao.clothcycle.api.entity.CarritodeCompras;
import com.upao.clothcycle.api.service.CarritodeComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/carritos")
public class CarritodeComprasController {

    private final CarritodeComprasService carritoService;

    @Autowired
    public CarritodeComprasController(CarritodeComprasService carritoService) {
        this.carritoService = carritoService;
    }





    @PostMapping("/pagar/{id}")
    public void pagarCarrito(@PathVariable Long id) {
        Optional<CarritodeCompras> carritoOptional = carritoService.obtenerCarritoPorId(id);
        carritoOptional.ifPresent(carritoService::pagarCarrito);
    }