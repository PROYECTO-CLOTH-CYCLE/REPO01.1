package com.upao.proyecto.service;


import com.upao.proyecto.entity.Usuario;
import com.upao.proyecto.entity.UsuarioRol;
import java.util.Set;


public interface UsuarioService {
   Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

   Usuario obtenerUsuario(String username);

    void eliminarUsuario(Long usuarioId);
}