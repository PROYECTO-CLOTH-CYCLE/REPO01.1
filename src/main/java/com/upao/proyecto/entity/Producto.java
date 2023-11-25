package com.upao.proyecto.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")  // Cambié el nombre de la columna a "id"
    private Long id;

    @Column(name = "producto_nombre")
    private String nombre;

    @Column(name = "producto_precio")
    private double precio;

    @Column(name = "producto_cantdisponible")
    private int cantidadDisponible;

    @Column(name = "producto_descripcion")
    private String descripcion;
}