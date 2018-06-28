package com.tomaszdev.spring5recepieapp.model;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Recipe recipe;

    @Lob // large object
    private String recipeNotes;
}
