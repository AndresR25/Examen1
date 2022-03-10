/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen1.service;

import com.Examen1.entity.Evento;
import com.Examen1.repository.EventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService implements iEventoService {
    
     @Autowired
      private EventoRepository eventoRepository;

    @Override
    public List<Evento> getAllEventos() {
        return(List<Evento>)eventoRepository.findAll();
    }

    @Override
    public void saveEvento(Evento evento) {
        eventoRepository.save(evento);
    }

    @Override
    public Evento getEventoById(long id) {
        return eventoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        eventoRepository.deleteById(id);
    }
    
}
