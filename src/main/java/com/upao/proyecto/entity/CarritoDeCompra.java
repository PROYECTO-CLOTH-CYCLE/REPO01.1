package com.upao.proyecto.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "carritos_de_compra")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarritoDeCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carritoId;

    // Otros atributos y métodos de la clase
}