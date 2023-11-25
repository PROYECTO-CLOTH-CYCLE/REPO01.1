package com.upao.proyecto.service.impl;
import com.upao.proyecto.entity.CarritoDeCompra;
import com.upao.proyecto.repository.CarritoDeCompraRepository;
import com.upao.proyecto.service.CarritoDeCompraService;
import java.util.List;
import java.util.Optional;

public class CarritoDeCompraServiceImpl implements CarritoDeCompraService {

    private final CarritoDeCompraRepository carritoDeCompraRepository;

    public CarritoDeCompraServiceImpl(CarritoDeCompraRepository carritoDeCompraRepository) {
        this.carritoDeCompraRepository = carritoDeCompraRepository;
    }

    @Override
    public List<CarritoDeCompra> getAllCarritos() {
        return carritoDeCompraRepository.findAll();
    }

    @Override
    public Optional<CarritoDeCompra> getCarritoById(Long carritoId) {
        return carritoDeCompraRepository.findByCarritoId(carritoId);
    }

    // Implementación de otros métodos según las necesidades
}