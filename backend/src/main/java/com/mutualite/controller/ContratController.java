package com.mutualite.controller;

import com.mutualite.model.Contrat;
import com.mutualite.repository.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contrats")
public class ContratController {

    @Autowired
    private ContratRepository contratRepository;

    @GetMapping
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Contrat> createContrat(@RequestBody Contrat contrat) {
        Contrat savedContrat = contratRepository.save(contrat);
        return ResponseEntity.ok(savedContrat);
    }
}
