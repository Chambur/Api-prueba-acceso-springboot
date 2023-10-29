package com.example.prueba_acceso.prueba_acceso.persistance.entity;



import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
