package com.mutualite.controller;

import com.mutualite.model.Consentement;
import com.mutualite.service.ConsentementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consentements")
public class ConsentementController {

    @Autowired
    private ConsentementService consentementService;

    @GetMapping
    public List<Consentement> getAllConsentements() {
        return consentementService.getAllConsentements();
    }

    @PostMapping
    public ResponseEntity<Consentement> createConsentement(@RequestBody Consentement consentement) {
        return ResponseEntity.ok(consentementService.createConsentement(consentement));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> revokeConsentement(@PathVariable Integer id) {
        consentementService.revokeConsentement(id);
        return ResponseEntity.ok("Consentement révoqué avec succès.");
    }
}
