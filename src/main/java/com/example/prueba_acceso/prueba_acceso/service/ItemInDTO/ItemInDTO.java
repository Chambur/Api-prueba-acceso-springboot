package com.example.prueba_acceso.prueba_acceso.service.ItemInDTO;

import com.example.prueba_acceso.prueba_acceso.persistance.entity.ItemCapacity;
import com.example.prueba_acceso.prueba_acceso.persistance.entity.ItemContainer;
import com.example.prueba_acceso.prueba_acceso.persistance.entity.ItemStatus;
import com.example.prueba_acceso.prueba_acceso.persistance.entity.ItemType;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ItemInDTO {

    private ItemType type;
    private boolean fridge;
    private ItemCapacity capacity;
    private ItemContainer container;
    private String name;
    private int Item_id;
    private String clientName;
    private LocalDateTime timestamp;
    private ItemStatus status;

}
