package com.mutualite.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class HistoriqueSeuil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Partenaire partenaire;

    private LocalDate dateAjustement;
    private float ancienSeuil;
    private float nouveauSeuil;

    // Getters and Setters
}
