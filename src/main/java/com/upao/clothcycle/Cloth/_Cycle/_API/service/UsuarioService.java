package com.upao.clothcycle.Cloth._Cycle._API.service;

import com.upao.clothcycle.Cloth._Cycle._API.entity.Usuario;
import com.upao.clothcycle.Cloth._Cycle._API.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

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