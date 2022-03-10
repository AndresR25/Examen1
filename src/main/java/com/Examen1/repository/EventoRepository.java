/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Examen1.repository;

import com.Examen1.entity.Evento;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author kflex25
 */
public interface EventoRepository extends CrudRepository<Evento,Long> {
    
}
