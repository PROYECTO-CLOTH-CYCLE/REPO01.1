package com.upao.proyecto.service;
import com.upao.proyecto.entity.Producto;
import com.upao.proyecto.repository.ProductoRepository;
import com.upao.proyecto.service.ProductoService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoServiceTest {

    @Mock
    private ProductoRepository productoRepository;

    @InjectMocks
    private ProductoService productoService;

    @Test
    public void testGetAllProducto() {
        // Given
        List<Producto> productos = new ArrayList<>();
        // Agrega algunos productos a la lista

        when(productoRepository.findAll()).thenReturn(productos);

        // When
        List<Producto> result = productoService.getAllProducto();

        // Then
        assertEquals(productos, result);
    }

    @Test
    public void testGetProductoByNombreExistente() {
        // Given
        Producto producto = new Producto(1L, "Camisa", 29.99, 100, "Descripción de la camisa");

        when(productoRepository.findByNombre("Camisa")).thenReturn(Optional.of(producto));

        // When
        Optional<Producto> result = productoService.getProductoByNombre("Camisa");

        // Then
        assertTrue(result.isPresent());
        assertEquals(producto, result.get());
    }

    @Test
    public void testGetProductoByNombreNoExistente() {
        // Given
        when(productoRepository.findByNombre("Camisa")).thenReturn(Optional.empty());

        // When
        Optional<Producto> result = productoService.getProductoByNombre("Camisa");

        // Then
        assertFalse(result.isPresent());
    }

    @Test
    public void testAddProducto() {
        // Given
        Producto producto = new Producto(1L, "Camisa", 29.99, 100, "Descripción de la camisa");

        // When
        productoService.addProducto(producto);

        // Then
        verify(productoRepository, times(1)).save(producto);
    }

    @Test
    public void testUpdateProducto() {
        // Given
        Producto producto = new Producto(1L, "Camisa", 29.99, 100, "Descripción de la camisa");

        when(productoRepository.findByNombre("Camisa")).thenReturn(Optional.of(producto));

        // When
        productoService.updateProducto(producto, "Camisa");

        // Then
        verify(productoRepository, times(1)).save(producto);
    }

    @Test
    public void testDeleteProductoByNombre() {
        // When
        productoService.deleteProductoByNombre("Camisa");

        // Then
        verify(productoRepository, times(1)).deleteByNombre("Camisa");
    }
}