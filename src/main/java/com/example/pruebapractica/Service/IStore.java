package com.example.pruebapractica.Service;

import com.example.pruebapractica.Entity.Store;
import com.example.pruebapractica.Entity.datos;
import com.example.pruebapractica.response.Numbers;

import java.util.List;
import java.util.Optional;

public interface IStore {
    public List<datos> readAllDa();
    public List<Store> readAll();
    public List<Numbers> readAllNumbers();
}
