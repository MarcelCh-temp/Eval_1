package com.chamblas.bastian.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chamblas.bastian.Model.Evento;
import com.chamblas.bastian.Repository.EventoRepository;

@Service
public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;
    
    public List<Evento> getEventos() {
        return eventoRepository.obtenerEventos();
    }

    public Evento saveEvento(Evento e) {
        return eventoRepository.RegistrarEvento(e);
    }

    public Evento updateEvento(Evento e) {
        return eventoRepository.actualizar(e);
    }

    public Evento getEventoById(int id) {
        return eventoRepository.buscarPorId(id);
    }

    public String deleteEvento(int id) {
        eventoRepository.eliminar(id);
        return "Evento Eliminado";
    }
}