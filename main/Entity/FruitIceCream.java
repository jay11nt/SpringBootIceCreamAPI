package com.example.icecream.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FruitIceCream {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flavorName = "Fruit";

    @ManyToMany(mappedBy = "iceCreams")
    private Set<Category> categories;

    // Getters and setters
}

