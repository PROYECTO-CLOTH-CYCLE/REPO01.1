package com.upao.proyecto.controller;

import com.upao.proyecto.entity.Tienda;
import com.upao.proyecto.service.TiendaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/tiendas")
public class TiendaController {

    private final TiendaService tiendaService;

    public TiendaController(TiendaService tiendaService) {
        this.tiendaService = tiendaService;
    }

    @GetMapping
    public List<Tienda> getAllTienda(){
        return tiendaService.getAllTienda();
    }

    @GetMapping("/{tiendaId}")
    public Tienda getTiendaById(@PathVariable Long tiendaId){
        return tiendaService.getTiendaById(tiendaId).orElse(new Tienda());
    }

    @PostMapping
    public void addTienda(@RequestBody Tienda tienda) {
        tiendaService.addTienda(tienda);
    }

    @PutMapping("/{tiendaId}")
    public void updateTienda(@RequestBody Tienda tienda, @PathVariable Long tiendaId) {
        tiendaService.updateTienda(tienda, tiendaId);
    }

    @DeleteMapping("/{tiendaId}")
    public void deleteTiendaById(@PathVariable Long tiendaId) {
        tiendaService.deleteTiendaById(tiendaId);
    }
}