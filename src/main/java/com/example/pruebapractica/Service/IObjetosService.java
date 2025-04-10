package com.example.pruebapractica.Service;

import com.example.pruebapractica.Entity.Store;
import com.example.pruebapractica.response.Numbers;

import java.util.List;

public interface IObjetosService {
    public List<Numbers> getAllDataOb();
    public String saveAll();
    public List<Store> getAll();
    public Store update(Integer id, Store store);
    public Store delete(Integer id);
}
