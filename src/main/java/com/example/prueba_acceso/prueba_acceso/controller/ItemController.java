package com.example.prueba_acceso.prueba_acceso.controller;

import com.example.prueba_acceso.prueba_acceso.persistance.entity.Item;
import com.example.prueba_acceso.prueba_acceso.service.ItemInDTO.ItemInDTO;
import com.example.prueba_acceso.prueba_acceso.service.ItemService;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public Item newItem(@RequestBody ItemInDTO itemindto){
        return this.itemService.newItem(itemindto);
    }


    @GetMapping
    public List<Item> getAllItems(){
        return this.itemService.getAllItems();
    }

    @DeleteMapping("/{itemId}")
    public ResponseEntity<String> deleteItem(@PathVariable Long itemId) {
        try {
            itemService.deleteItemById(itemId);
            return ResponseEntity.ok("Item eliminado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar el item");
        }
    }

    @PutMapping("/{itemId}")
    public ResponseEntity<String> updateItem(@PathVariable Long itemId, @RequestBody ItemInDTO updatedItem) {
        try {
            Item item = itemService.updateItemById(itemId, updatedItem);

            if (item != null) {
                return ResponseEntity.ok("Item actualizado exitosamente");
            } else {
                return (ResponseEntity<String>) ResponseEntity.notFound();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar el item");
        }
    }


}
