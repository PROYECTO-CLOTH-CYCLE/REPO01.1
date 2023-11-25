package com.upao.proyecto.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name ="Tiendas")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tienda {
    @Id
    @Column( name = "tienda_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TiendaId;

    @Column( name = "tienda_nombre")
    private String nombre;
    @Column( name = "tienda_correo")
    private String correoElectronico;
    @Column( name = "tienda_contrasena")
    private String contrasena;
}


