package com.mutualite.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private float montant;
    private LocalDate dateFacture;
    private boolean payee;

    @ManyToOne
    private Utilisateur utilisateur;

    // Getters and Setters
}
