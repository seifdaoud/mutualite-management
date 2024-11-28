package com.mutualite.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Consentement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConsentement;

    @Enumerated(EnumType.STRING)
    private TypeConsentement typeConsentement;

    private LocalDate dateConsentement;
    private Boolean valide;

    // Getters and Setters
    public Integer getIdConsentement() {
        return idConsentement;
    }

    public void setIdConsentement(Integer idConsentement) {
        this.idConsentement = idConsentement;
    }

    public TypeConsentement getTypeConsentement() {
        return typeConsentement;
    }

    public void setTypeConsentement(TypeConsentement typeConsentement) {
        this.typeConsentement = typeConsentement;
    }

    public LocalDate getDateConsentement() {
        return dateConsentement;
    }

    public void setDateConsentement(LocalDate dateConsentement) {
        this.dateConsentement = dateConsentement;
    }

    public Boolean getValide() {
        return valide;
    }

    public void setValide(Boolean valide) {
        this.valide = valide;
    }
}
