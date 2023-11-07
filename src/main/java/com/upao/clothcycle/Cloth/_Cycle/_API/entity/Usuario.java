package com.upao.clothcycle.Cloth._Cycle._API.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
<<<<<<< HEAD
    @Column(name = "Usuario_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "Telefono")
    private String numeroTelefonico;

    @Column(name = "Correo")
    private String correoElectronico;

    @Column(name = "Contrasena")
    private String contrasena;

    public Usuario() {
        // Constructor vacío necesario para JPA
    }

    public Usuario(String nombre, String apellido, String numeroTelefonico, String correoElectronico, String contrasena) {
=======
    @Column(name = "U+suario_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Telefono")
    private String numeroTelefonico;
    @Column(name = "Correo")
    private String correoElectronico;
    @Column(name = "Contraseña")
    private String contrasena;

    public Usuario(Long usuarioId, String nombre, String apellido, String numeroTelefonico, String correoElectronico, String contrasena) {
        this.usuarioId = usuarioId;
>>>>>>> 522fedf7d97c10e067fcd6c446ec4089ac3460bf
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefonico = numeroTelefonico;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    // Métodos getters y setters

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 522fedf7d97c10e067fcd6c446ec4089ac3460bf
