package com.upao.clothcycle.Cloth._Cycle._API.service;

import com.upao.clothcycle.api.entity.Usuario;
import com.upao.clothcycle.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository, BCryptPasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Optional<Usuario> iniciarSesion(String correo, String contrasena) {
        return usuarioRepository.findByCorreoAndContrasena(correo, contrasena);
    }

    public Usuario registrarUsuario(Usuario usuario) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findByCorreo(usuario.getCorreo());
        if (usuarioExistente.isPresent()) {
            // El correo electrónico ya está registrado, manejar el error o lanzar una excepción
            // ...
            return null;
        }

        String contrasenaHash = passwordEncoder.encode(usuario.getContrasena());
        usuario.setContrasena(contrasenaHash);

        return usuarioRepository.save(usuario);
    }