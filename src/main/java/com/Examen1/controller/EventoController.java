/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen1.controller;

import com.Examen1.entity.Evento;
import com.Examen1.service.iEventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventoController {
    
    @Autowired
    private iEventoService eventoService;
    
    @GetMapping({"/","/eventos"})
    public String eventos(Model model){
    List<Evento> listaEventos=eventoService.getAllEventos();
    model.addAttribute("eventos",listaEventos);
    return "Eventos.html";
    }
    
    @GetMapping("/eventosN")
    public String crearEvento(Model model){
        model.addAttribute("evento",new Evento());
        return "CrearEvento";
    }
    
    @PostMapping("/save")
    public String guardarEvento(@ModelAttribute Evento evento){
        eventoService.saveEvento(evento);
        return "redirect:/eventos";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarEvento(@PathVariable("id") Long idEvento){
        eventoService.delete(idEvento);
        return "redirect:/eventos";
    }
    
}
