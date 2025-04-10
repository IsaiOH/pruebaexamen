package com.example.pruebapractica.Repository;

import com.example.pruebapractica.Entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store,Integer> {
    @Query(value = "SELECT * FROM store ORDER BY first_name ASC;", nativeQuery = true)
    List<Store>getAllAsc();
}
