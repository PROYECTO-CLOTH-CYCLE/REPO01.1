package com.upao.clothcycle.Cloth._Cycle._API.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Puntos_de_Reciclaje")
public class Puntosdereciclaje {

    @Id
    @Column(name = "Ubicación")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ubicacion;
    @Column(name = "Horarios")
    private String horariosDeAtencion;
    @Column(name = "Materiales")
    private String tipoDeMaterialesAceptados;

    public Puntosdereciclaje(String ubicacion, String horariosDeAtencion, String tipoDeMaterialesAceptados) {
        this.ubicacion = ubicacion;
        this.horariosDeAtencion = horariosDeAtencion;
        this.tipoDeMaterialesAceptados = tipoDeMaterialesAceptados;
    }

    // Métodos getters y setters

    public String getUbicación() {
        return ubicacion;
    }

    public void setUbicación(String ubicación) {
        this.ubicacion = ubicación;
    }

    public String getHorariosDeAtención() {
        return horariosDeAtencion;
    }

    public void setHorariosDeAtención(String horariosDeAtención) {
        this.horariosDeAtencion = horariosDeAtención;
    }

    public String getTipoDeMaterialesAceptados() {
        return tipoDeMaterialesAceptados;
    }

    public void setTipoDeMaterialesAceptados(String tipoDeMaterialesAceptados) {
        this.tipoDeMaterialesAceptados = tipoDeMaterialesAceptados;
    }

    // Métodos de negocio

    public void verInformaciónDePuntosDeReciclaje() {
        // Implementar lógica para ver información de puntos de reciclaje
    }
}