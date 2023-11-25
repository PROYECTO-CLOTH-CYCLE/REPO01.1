package com.upao.proyecto.controller;
import com.upao.proyecto.entity.CarritoDeCompra;
import com.upao.proyecto.service.CarritoDeCompraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carritos")
public class CarritoDeCompraController {

    private final CarritoDeCompraService carritoDeCompraService;

    public CarritoDeCompraController(CarritoDeCompraService carritoDeCompraService) {
        this.carritoDeCompraService = carritoDeCompraService;
    }

    @GetMapping
    public List<CarritoDeCompra> getAllCarritos() {
        return carritoDeCompraService.getAllCarritos();
    }

    @GetMapping("/{carritoId}")
    public CarritoDeCompra getCarritoById(@PathVariable Long carritoId) {
        return carritoDeCompraService.getCarritoById(carritoId)
                .orElse(new CarritoDeCompra());
    }

    // Otros métodos para agregar, actualizar y eliminar carritos
}