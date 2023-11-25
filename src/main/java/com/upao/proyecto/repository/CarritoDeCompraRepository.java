package com.upao.proyecto.repository;
import com.upao.proyecto.entity.CarritoDeCompra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarritoDeCompraRepository extends JpaRepository<CarritoDeCompra, Long> {
    Optional<CarritoDeCompra> findByCarritoId(Long carritoId);

    // Otros métodos según las necesidades
}