package com.example.pruebapractica.controller;


import com.example.pruebapractica.Service.Impl.ObjetosServicio;
import com.example.pruebapractica.model.objetos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ObjetosController {

    @Autowired
    ObjetosServicio objetosServicio;

    @GetMapping("/objetos")
    public List<objetos> getAllData(){
        return objetosServicio.getAllData();
    }
}
