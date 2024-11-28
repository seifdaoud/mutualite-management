package com.mutualite.controller;

import com.mutualite.model.Facture;
import com.mutualite.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/factures")
public class FactureController {

    @Autowired
    private FactureRepository factureRepository;

    @GetMapping
    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Facture> createFacture(@RequestBody Facture facture) {
        Facture savedFacture = factureRepository.save(facture);
        return ResponseEntity.ok(savedFacture);
    }
}
