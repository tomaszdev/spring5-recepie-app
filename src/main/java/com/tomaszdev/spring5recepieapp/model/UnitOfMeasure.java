package com.tomaszdev.spring5recepieapp.model;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnitOfMeasure() {
        return description;
    }

    public void setUnitOfMeasure(String description) {
        this.description = description;
    }
}
