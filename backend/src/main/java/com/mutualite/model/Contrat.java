package com.mutualite.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String numeroContrat;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    @ManyToOne
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL)
    private List<Garantie> garanties;

    // Getters and Setters
}
