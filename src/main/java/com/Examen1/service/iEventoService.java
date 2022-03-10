/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Examen1.service;

import com.Examen1.entity.Evento;
import java.util.List;


public interface iEventoService {
    public List<Evento> getAllEventos();
    public void saveEvento(Evento evento);
    public Evento getEventoById(long id);
    public void delete(long id);
}
