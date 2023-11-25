package com.upao.proyecto.service;
import com.upao.proyecto.entity.CarritoDeCompra;

import java.util.List;
import java.util.Optional;

public interface CarritoDeCompraService {
    List<CarritoDeCompra> getAllCarritos();

    Optional<CarritoDeCompra> getCarritoById(Long carritoId);

    // Otros métodos para agregar, actualizar y eliminar carritos
}