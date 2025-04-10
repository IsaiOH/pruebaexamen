package com.example.pruebapractica.feign;

import com.example.pruebapractica.response.Numbers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "objetos", url = "http://localhost:8080/")
public interface Objetos {

    @GetMapping("/store/informacion")
    public List<Numbers> getAllData();

    @GetMapping("/objects/records")
    public List<Numbers> getAllDataOb();
}
