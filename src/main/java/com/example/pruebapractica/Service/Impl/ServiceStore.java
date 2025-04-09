package com.example.pruebapractica.Service.Impl;

import com.example.pruebapractica.Entity.Store;
import com.example.pruebapractica.Entity.datos;
import com.example.pruebapractica.Repository.StoreRepository;
import com.example.pruebapractica.Repository.datosRepository;
import com.example.pruebapractica.Service.IStore;
import com.example.pruebapractica.response.Numbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceStore implements IStore {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    datosRepository datosRepository;

    @Override
    public List<datos> readAllDa() {
        return datosRepository.findAll();
    }

    @Override
    public List<Store> readAll() {
        return storeRepository.findAll();
    }



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


}
