package com.mutualite.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Partenaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private String type; // Hôpital, Clinique
    private String region;

    @OneToMany(mappedBy = "partenaire", cascade = CascadeType.ALL)
    private List<HistoriqueSeuil> historiqueSeuils;

    // Getters and Setters
}
