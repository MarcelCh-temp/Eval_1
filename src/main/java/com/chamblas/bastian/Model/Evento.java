package com.chamblas.bastian.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evento {
    private int id;
    private String nombre;
    private String tipoevento;
    private int fecha;
    private String lugar;
    private int capacidad;
}