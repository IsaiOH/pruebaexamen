package com.example.pruebapractica.controller;



import com.example.pruebapractica.Entity.Store;
import com.example.pruebapractica.Service.Impl.ServiceObjects;
import com.example.pruebapractica.response.Numbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objects")
public class ObjetosController {

    @Autowired
    ServiceObjects objetosServicio;

    @GetMapping("/records")
    public List<Numbers> getAllData(){
        return objetosServicio.getAllDataOb();
    }

    @GetMapping("/save")
    public String saveAllDataOb(){
        return objetosServicio.saveAll();
    }

    @GetMapping("/customers/test")
    public List<Store> getAll(){
        return objetosServicio.getAll();
    }

    @PutMapping("/customers/{id}/test")
    public Store update(@PathVariable Integer id, @RequestBody Store store){ return objetosServicio.update(id,store);
    }

    @DeleteMapping("/customers/{id}/test")
    public Store delete(@PathVariable Integer id){return objetosServicio.delete(id);}
}
