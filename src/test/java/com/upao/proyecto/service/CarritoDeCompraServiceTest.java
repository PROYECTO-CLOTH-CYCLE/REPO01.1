package com.upao.proyecto.service;
import com.upao.proyecto.entity.CarritoDeCompra;
import com.upao.proyecto.repository.CarritoDeCompraRepository;
import com.upao.proyecto.service.CarritoDeCompraService;
import com.upao.proyecto.service.impl.CarritoDeCompraServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertSame;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoDeCompraServiceTest {

    @Mock
    private CarritoDeCompraRepository carritoDeCompraRepository;

    @InjectMocks
    private CarritoDeCompraService carritoDeCompraService = new CarritoDeCompraServiceImpl(carritoDeCompraRepository);

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllCarritos() {
        // Given
        CarritoDeCompra carrito1 = new CarritoDeCompra(/*...*/);
        CarritoDeCompra carrito2 = new CarritoDeCompra(/*...*/);
        List<CarritoDeCompra> carritos = Arrays.asList(carrito1, carrito2);

        when(carritoDeCompraRepository.findAll()).thenReturn(carritos);

        // When
        List<CarritoDeCompra> result = carritoDeCompraService.getAllCarritos();

        // Then
        verify(carritoDeCompraRepository, times(1)).findAll();
        // Asegurar que la lista resultante es la misma que la proporcionada por el repositorio
        assertSame(carritos, result);
    }

    @Test
    public void testGetCarritoById() {
        // Given
        Long carritoId = 1L;
        CarritoDeCompra carrito = new CarritoDeCompra(/*...*/);

        when(carritoDeCompraRepository.findByCarritoId(carritoId)).thenReturn(Optional.of(carrito));

        // When
        Optional<CarritoDeCompra> result = carritoDeCompraService.getCarritoById(carritoId);

        // Then
        verify(carritoDeCompraRepository, times(1)).findByCarritoId(carritoId);
        // Asegurar que el resultado es el carrito proporcionado por el repositorio
        assertTrue(result.isPresent());
        assertSame(carrito, result.get());
    }

    // Agregar más tests según las operaciones y casos que necesites probar

}