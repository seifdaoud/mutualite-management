package com.mutualite.model;

import javax.persistence.*;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private String email;
    private String motDePasse;
    private String role; // ADMIN, GESTIONNAIRE, ADHERENT

    // Getters and Setters
}
