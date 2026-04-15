package com.chamblas.bastian.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

import com.chamblas.bastian.Model.Evento;
import com.chamblas.bastian.Service.EventoService;




@RestController
@RequestMapping("/api/v1/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    public List<Evento> listarEventos() {
        return eventoService.getEventos();
    }
    @PostMapping
    public Evento agregarEvento (@Validated @RequestBody Evento evento) {
        return eventoService.saveEvento(evento);
    }

    @GetMapping("{id}")
    public Evento buscarEvento(@PathVariable int id) {
        return eventoService.getEventoById(id);
    }

    @PutMapping("path/{id}")
    public Evento actualizarEvento(@PathVariable int id, @Validated @RequestBody Evento evento) {
        return eventoService.updateEvento(evento);
    }

    @DeleteMapping("{id}")
    public String eliminarEvento(@PathVariable int id) {
        return eventoService.deleteEvento(id);
    }
    
}