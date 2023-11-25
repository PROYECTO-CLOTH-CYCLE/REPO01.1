package com.upao.clothcycle.Cloth._Cycle._API.service;

<<<<<<< HEAD
import com.upao.clothcycle.Cloth._Cycle._API.entity.Usuario;
import com.upao.clothcycle.Cloth._Cycle._API.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
=======
import com.upao.clothcycle.api.entity.Usuario;
import com.upao.clothcycle.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

>>>>>>> 522fedf7d97c10e067fcd6c446ec4089ac3460bf
import java.util.Optional;

@Service
public class UsuarioService {

<<<<<<< HEAD
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(Long usuarioId) {
        Optional<Usuario> usuario = usuarioRepository.findById(usuarioId);
        return usuario.orElse(null);
    }

    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario updateUsuario(Long usuarioId, Usuario usuario) {
        if (usuarioRepository.existsById(usuarioId)) {
            usuario.setUsuarioId(usuarioId);
            return usuarioRepository.save(usuario);
        }
        return null; // El usuario no existe, no se puede actualizar.
    }

    public void deleteUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }
}
=======
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
>>>>>>> 522fedf7d97c10e067fcd6c446ec4089ac3460bf
