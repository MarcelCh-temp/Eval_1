package com.chamblas.bastian.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.chamblas.bastian.Model.Evento;

@Repository
public class EventoRepository {
    private List<Evento> listaEventos = new ArrayList<>();

    public List<Evento> obtenerEventos() {
        return listaEventos;
    }

    public Evento buscarPorId(int id) {
        for (Evento evento : listaEventos) {
            if (evento.getId() == id) {
                return evento;
            }
        }
        return null; // Retorna null si no se encuentra el evento
    }

    public Evento RegistrarEvento(Evento e) {
        listaEventos.add(e);
        return e; // Retorna el evento registrado
    }
    
    public Evento actualizar(Evento e) {
        int id = 0;
        int idModif = 0;
        
        for (int i = 0; i < listaEventos.size(); i++) {
            if (listaEventos.get(i).getId() == e.getId()) {
                id = e.getId();
                idModif = i;
            }
        }
        Evento evento1 = new Evento();
        evento1.setId(id);
        evento1.setNombre(e.getNombre());
        evento1.setTipoevento(e.getTipoevento());
        evento1.setFecha(e.getFecha());
        evento1.setLugar(e.getLugar());
        evento1.setCapacidad(e.getCapacidad());
        
        listaEventos.set(idModif, evento1);
        return evento1; // Retorna el evento actualizado
    }

    public void eliminar(int id) {
        listaEventos.removeIf(x -> x.getId() == id);
    }
}