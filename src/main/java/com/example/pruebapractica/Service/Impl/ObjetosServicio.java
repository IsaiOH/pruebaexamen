package com.example.pruebapractica.Service.Impl;

import com.example.pruebapractica.Entity.Store;
import com.example.pruebapractica.Repository.StoreRepository;
import com.example.pruebapractica.Service.IObjetosService;
import com.example.pruebapractica.feign.Objetos;
import com.example.pruebapractica.model.objetos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ObjetosServicio implements IObjetosService {

    @Autowired
    Objetos objetos;

    @Autowired
    StoreRepository storeRepository;

    @Override
    public List<objetos> getAllData() {
       List<objetos>lista1 = objetos.getAllData();
       // return lista1.stream().filter(obj -> Arrays.asList(obj.getPhone_numbers()).isEmpty()).toList();

        List<Store> entidades = lista1.stream()
                .map(this::mapToEntity) // Convierte cada DTO a entidad
                .collect(Collectors.toList());

        storeRepository.saveAll(entidades);

         return lista1.stream().filter(obj -> Arrays.asList(obj.getPhone_numbers()).isEmpty()).toList();
    }
    public  Store mapToEntity(objetos dto) {
        Store entidad = new Store();
        entidad.setPhone_number(Arrays.toString(dto.getPhone_numbers()));
        entidad.setLast_name(dto.getLast_name());
        entidad.setExternal_id(dto.getExternal_id());
        entidad.setFirst_name(dto.getFirst_name());
        return entidad;
    }
}
