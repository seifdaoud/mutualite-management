package com.mutualite.model;

import javax.persistence.*;

@Entity
public class Garantie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String type;
    private float plafond;

    @ManyToOne
    private Contrat contrat;

    // Getters and Setters
}
