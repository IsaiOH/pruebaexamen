package com.example.pruebapractica.Service.Impl;

import com.example.pruebapractica.Entity.Store;
import com.example.pruebapractica.Repository.StoreRepository;
import com.example.pruebapractica.Service.IObjetosService;
import com.example.pruebapractica.feign.Objetos;
import com.example.pruebapractica.response.Numbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServiceObjects implements IObjetosService {

    @Autowired
    Objetos objetos;

    @Autowired
    StoreRepository storeRepository;

    @Override
    public List<Numbers> getAllDataOb() {
        List<Numbers>lista1 = objetos.getAllData();
        // return lista1.stream().filter(obj -> Arrays.asList(obj.getPhone_numbers()).isEmpty()).toList();
        lista1 = lista1.stream().filter(obj -> Arrays.asList(obj.getNumbers()).isEmpty()).toList();
        return  lista1;

    }

    @Override
    public String saveAll() {
        List<Numbers>lista1 = objetos.getAllDataOb();
        // return lista1.stream().filter(obj -> Arrays.asList(obj.getPhone_numbers()).isEmpty()).toList();
        lista1 = lista1.stream().filter(obj -> Arrays.asList(obj.getNumbers()).isEmpty()).toList();
        List<Store> entidades = lista1.stream()
                .map(this::mapToEntity) // Convierte cada DTO a entidad
                .collect(Collectors.toList());
        storeRepository.saveAll(entidades);

        return "Guardado Exitosamente";
    }

    @Override
    public List<Store> getAll() {
        List<Store> lista = storeRepository.getAllAsc();

        return lista;
    }

    @Override
    public Store update(Integer id,Store stor) {
        Optional<Store> store = storeRepository.findById(id);
        return storeRepository.save(stor);

    }

    @Override
    public Store delete(Integer id) {
        Optional<Store> store = storeRepository.findById(id);
         storeRepository.deleteById(id);
        return store.get();
    }

    public Store mapToEntity(Numbers dto) {
        Store entidad = new Store();
        entidad.setPhone_number(Arrays.toString(dto.getNumbers()));
        entidad.setLast_name(dto.getLast_name());
        entidad.setExternal_id(dto.getExternal_id());
        entidad.setFirst_name(dto.getFirst_name());
        return entidad;
    }
}
