package com.upao.clothcycle.Cloth._Cycle._API.controller;

import com.upao.clothcycle.Cloth._Cycle._API.entity.Usuario;
import com.upao.clothcycle.Cloth._Cycle._API.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/{usuarioId}")
    public Usuario getUsuarioById(@PathVariable Long usuarioId) {
        return usuarioService.getUsuarioById(usuarioId);
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.createUsuario(usuario);
    }

    @PutMapping("/{usuarioId}")
    public Usuario updateUsuario(@PathVariable Long usuarioId, @RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(usuarioId, usuario);
    }

    @DeleteMapping("/{usuarioId}")
    public void deleteUsuario(@PathVariable Long usuarioId) {
        usuarioService.deleteUsuario(usuarioId);
    }
}

