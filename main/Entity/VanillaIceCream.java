package com.example.icecream.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class VanillaIceCream 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flavorName = "Vanilla";

    @ManyToMany(mappedBy = "iceCreams")
    private Set<Category> categories;

    // Getters and setters
}

