/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.m5b.examenfinal_cochancela.modelo;

import lombok.Data;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author lilis
 */
@Document(collection="Periodo")
@Data
public class Periodo {
    @Id
    private String periodo;
    private int year;
}
