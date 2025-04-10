package com.example.pruebapractica.controller;

import com.example.pruebapractica.Service.Impl.ServiceStore;
import com.example.pruebapractica.response.Numbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    ServiceStore serviceStore;

    @GetMapping("/informacion")
    public List<Numbers> readAllDa(){return serviceStore.readAllDa();}


    /*
    @GetMapping("/customers/test")
    public List<Store> readAll(){
        return serviceStore.readAll();
    }

*/
    /*
    @GetMapping("/customers")
    public String[] readById(){
        List<String> valores = new ArrayList<>();
        List<Store> store = serviceStore.readAll();
       String numeros = store.get(0).getPhone_number();
        String[] frase = numeros.split(",");

       return frase;
    }
*/
   /*
    @GetMapping("/customers/numeros")
    public List<Numbers> readAllNumbers(){
        return serviceStore.readAllNumbers();
    }
    */
}
