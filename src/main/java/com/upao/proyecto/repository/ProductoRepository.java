package com.upao.proyecto.repository;
import com.upao.proyecto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    Optional<Producto> findByNombre(String nombre);

    void deleteByNombre(String nombre);
}