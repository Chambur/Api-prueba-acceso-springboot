package com.example.prueba_acceso.prueba_acceso.persistance.entity;

public enum ItemCapacity {
    ciengramos(100),
    milgramos(1000);

    private final int value;
    ItemCapacity(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
