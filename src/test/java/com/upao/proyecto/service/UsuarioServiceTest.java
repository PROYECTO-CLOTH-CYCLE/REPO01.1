package com.upao.proyecto.service;
import com.upao.proyecto.entity.Usuario;
import com.upao.proyecto.entity.UsuarioRol;
import com.upao.proyecto.repository.RolRepository;
import com.upao.proyecto.repository.UsuarioRepository;
import com.upao.proyecto.service.UsuarioService;
import com.upao.proyecto.service.impl.UsuarioServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.*;

public class UsuarioServiceTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @Mock
    private RolRepository rolRepository;

    @InjectMocks
    private UsuarioService usuarioService = new UsuarioServiceImpl();

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGuardarUsuarioNuevo() throws Exception {
        // Given
        Usuario usuario = new Usuario(/*...*/);
        usuario.setUsername("nombreDeUsuario"); // Asegúrate de configurar un nombre de usuario no nulo

        Set<UsuarioRol> usuarioRoles = new HashSet<>();
        // Agregar roles y cualquier configuración necesaria

        when(usuarioRepository.findByUsername(anyString())).thenReturn(null);
        when(usuarioRepository.save(any(Usuario.class))).thenReturn(usuario);

        // When
        Usuario result = usuarioService.guardarUsuario(usuario, usuarioRoles);

        // Then
        verify(rolRepository, times(usuarioRoles.size())).save(any());
        verify(usuarioRepository, times(1)).save(any());
        // Utilizando assert para verificar el resultado
        assertNotNull(result);
        assertEquals("nombreDeUsuario", result.getUsername());
        // Realizar otras verificaciones según sea necesario
    }

    @Test
    public void testGuardarUsuarioExistente() {
        // Given
        Usuario usuario = new Usuario();
        usuario.setUsername("nombreDeUsuarioExistente");

        Set<UsuarioRol> usuarioRoles = new HashSet<>();
        // Agregar roles y cualquier configuración necesaria

        when(usuarioRepository.findByUsername(anyString())).thenReturn(usuario);

        // When
        Exception exception = assertThrows(Exception.class, () -> {
            usuarioService.guardarUsuario(usuario, usuarioRoles);
        });

        // Then
        assertEquals("El usuario ya esta presente", exception.getMessage());
        // Realizar otras verificaciones según sea necesario
    }

    @Test
    public void testObtenerUsuario() {
        // Given
        String nombreUsuario = "nombreDeUsuario";
        Usuario usuario = new Usuario();
        usuario.setUsername(nombreUsuario);

        when(usuarioRepository.findByUsername(nombreUsuario)).thenReturn(usuario);

        // When
        Usuario result = usuarioService.obtenerUsuario(nombreUsuario);

        // Then
        assertEquals(usuario, result);
        // Realizar otras verificaciones según sea necesario
    }

    @Test
    public void testEliminarUsuario() {
        // Given
        Long idUsuario = 1L;

        // When
        usuarioService.eliminarUsuario(idUsuario);

        // Then
        verify(usuarioRepository, times(1)).deleteById(idUsuario);
        // Realizar otras verificaciones según sea necesario
    }
}




