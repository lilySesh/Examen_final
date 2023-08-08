/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examen.m5b.examenfinal_cochancela.Repository;

import com.examen.m5b.examenfinal_cochancela.modelo.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author lilis
 */
public interface AsignaturaRepository extends MongoRepository<Asignatura, Long> {
    
}
