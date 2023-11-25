package com.upao.clothcycle.Cloth._Cycle._API.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Seguimiento_del_impacto")
public class Seguimientodelimpacto {

    @Id
    @Column(name = "Estadística_de_reciclaje")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String estadisticaDeReciclaje;

    public Seguimientodelimpacto(String estadisticaDeReciclaje) {
        this.estadisticaDeReciclaje = estadisticaDeReciclaje;
    }

    // Métodos getters y setters

    public String getEstadisticaDeReciclaje() {
        return estadisticaDeReciclaje;
    }

    public void setEstadísticaDeReciclaje(String estadisticaDeReciclaje) {
        this.estadisticaDeReciclaje = estadisticaDeReciclaje;
    }
}
