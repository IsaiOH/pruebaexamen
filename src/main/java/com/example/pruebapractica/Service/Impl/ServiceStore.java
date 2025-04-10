package com.example.pruebapractica.Service.Impl;

import com.example.pruebapractica.Repository.StoreRepository;
import com.example.pruebapractica.Repository.datosRepository;
import com.example.pruebapractica.Service.IStoreService;
import com.example.pruebapractica.response.Numbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStore implements IStoreService {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    datosRepository datosRepository;

    @Override
    public List<Numbers> readAllDa() {
        List<Numbers> lista;
         lista=datosRepository.findAll().stream().map(dato ->{

             if(dato.getPhone_number() == null){
                 String[] phones = new String[0];
                 return new Numbers(phones,dato.getLast_name(),dato.getExternal_id(),dato.getFirst_name());
             }

             String[] phones = dato.getPhone_number().split(",");

            return new Numbers(phones,dato.getLast_name(),dato.getExternal_id(),dato.getFirst_name());

        }).toList();
         return lista;
    }



/*
    @Override
    public List<Numbers> readAllNumbers() {
        List<Numbers> List=new ArrayList<>();
        List=storeRepository.findAll().stream().map(sto ->
        {
            String numeros = sto.getPhone_number();
            Numbers numbers;



            if(sto.getPhone_number() == null){
                System.out.println("Valores vacios");
                String[] frase = new String[0];
                 return new Numbers(frase, sto.getLast_name(), sto.getExternal_id(), sto.getFirst_name());
            }
            String[] phones = sto.getPhone_number().split(",");
            System.out.println("Con Valores");
            return new Numbers(phones,sto.getLast_name(),sto.getExternal_id(),sto.getFirst_name());

        }).toList();
        return List;
    }
*/

}
