package com.upao.proyecto.service;

import com.upao.proyecto.repository.TiendaRepository;
import org.springframework.stereotype.Service;
import com.upao.proyecto.entity.Tienda;
import java.util.List;
import java.util.Optional;

@Service
public class TiendaService {

    private final TiendaRepository tiendaRepository ;


    public TiendaService(TiendaRepository tiendaRepository) {
        this.tiendaRepository = tiendaRepository;
    }

    public List< Tienda > getAllTienda() {

        return tiendaRepository.findAll();
    }


    public Optional<Tienda> getTiendaById(Long TiendaId){
          return tiendaRepository.findById(TiendaId);

    }

    public void addTienda(Tienda tienda){
        tiendaRepository.save(tienda);

    }

    public void updateTienda(Tienda tienda, Long tiendaId) {
        Tienda tiendaExists = tiendaRepository.findById(tiendaId).orElse(new Tienda());

    }
        public void deleteTiendaById(Long tiendaId) {
            tiendaRepository.deleteById(tiendaId);
        }


}

