package com.upao.clothcycle.Cloth._Cycle._API.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Puntos_de_Reciclaje")
public class Publicaciondeprenda {

    @Id
    @Column(name = "Nombre")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre;
    @Column(name = "Descripción")
    private String descripción;
    @Column(name = "Precio")
    private double precio;
    @Column(name = "Contacto_vendedor")
    private String contactoVendedor;

    public Publicaciondeprenda(String nombre, String descripción, double precio, String contactoVendedor) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.precio = precio;
        this.contactoVendedor = contactoVendedor;
    }

    // Métodos getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getContactoVendedor() {
        return contactoVendedor;
    }

    public void setContactoVendedor(String contactoVendedor) {
        this.contactoVendedor = contactoVendedor;
    }
}