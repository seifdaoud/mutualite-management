package com.mutualite.controller;

import com.mutualite.model.Garantie;
import com.mutualite.repository.GarantieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/garanties")
public class GarantieController {

    @Autowired
    private GarantieRepository garantieRepository;

    @GetMapping
    public List<Garantie> getAllGaranties() {
        return garantieRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Garantie> createGarantie(@RequestBody Garantie garantie) {
        Garantie savedGarantie = garantieRepository.save(garantie);
        return ResponseEntity.ok(savedGarantie);
    }
}
