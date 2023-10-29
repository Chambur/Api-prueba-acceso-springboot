package com.example.prueba_acceso.prueba_acceso.service;

import com.example.prueba_acceso.prueba_acceso.mapper.ItemInDTOToItem;
import com.example.prueba_acceso.prueba_acceso.persistance.entity.Item;
import com.example.prueba_acceso.prueba_acceso.persistance.repository.ItemRepository;
import com.example.prueba_acceso.prueba_acceso.service.ItemInDTO.ItemInDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final ItemRepository repository;
    private final ItemInDTOToItem mapper;


    public ItemService(ItemRepository repository, ItemInDTOToItem mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Item newItem(ItemInDTO itemInDTO){
        Item item = mapper.map(itemInDTO);
        return this.repository.save(item);
    }

    public List<Item> getAllItems(){
        return this.repository.findAll();
    }

    public void deleteItemById(Long itemId) {

        repository.deleteById(itemId);
    }

    public Item updateItemById(Long itemId, ItemInDTO updatedItem) {
        Optional<Item> existingItem = repository.findById(itemId);

        if (existingItem.isPresent()) {
            Item item = existingItem.get();

            item.setClientName(updatedItem.getClientName());
            item.setTimestamp(updatedItem.getTimestamp());
            item.setStatus(updatedItem.getStatus());
            item.setContainer(updatedItem.getContainer());
            item.setFridge(updatedItem.isFridge());
            item.setCapacity(updatedItem.getCapacity());
            item.setType(updatedItem.getType());
            item.setName(updatedItem.getName());
            return repository.save(item);
        } else {
            return null;
        }
    }

}
