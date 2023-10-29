package com.example.prueba_acceso.prueba_acceso.persistance.repository;

import com.example.prueba_acceso.prueba_acceso.persistance.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
