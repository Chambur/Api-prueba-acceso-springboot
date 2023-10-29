package com.example.prueba_acceso.prueba_acceso.mapper;

import com.example.prueba_acceso.prueba_acceso.persistance.entity.*;
import com.example.prueba_acceso.prueba_acceso.service.ItemInDTO.ItemInDTO;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ItemInDTOToItem implements IMapper<ItemInDTO, Item>{
    @Override
    public Item map(ItemInDTO in) {
        Item myItem = new Item();

        myItem.setClientName(in.getClientName());
        myItem.setItem_id(in.getItem_id());
        myItem.setTimestamp(LocalDateTime.now());
        myItem.setStatus(ItemStatus.CREATED);
        // \\ //
        myItem.setContainer(in.getContainer());
        myItem.setFridge(in.isFridge());
        myItem.setCapacity(in.getCapacity());
        myItem.setType(in.getType());
        myItem.setName(in.getName());

        return myItem;
    }
}

/*
 private ItemType type;
    private boolean fridge;
    private ItemCapacity capacity;
    private ItemContainer container;
    private String name;
    private int Item_id;
    private String clientName;
    private LocalDateTime timestamp;
    private ItemStatus status;
 */
