package com.upao.clothcycle.Cloth._Cycle._API.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "carrito_de_compras")
public class CarritodeCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToMany
    @JoinTable(
            name = "carrito_producto",
            joinColumns = @JoinColumn(name = "carrito_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id"))
    private List<Producto> productos;

    private boolean pagado;