package com.mutualite.controller;

import com.mutualite.model.Utilisateur;
import com.mutualite.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurService.getAllUtilisateurs();
    }

    @PostMapping("/register")
    public ResponseEntity<Utilisateur> registerUtilisateur(@RequestBody Utilisateur utilisateur) {
        return ResponseEntity.ok(utilisateurService.registerUtilisateur(utilisateur));
    }

    @DeleteMapping("/{id}/supprimer-donnees")
    public ResponseEntity<String> demanderSuppressionDonnees(@PathVariable Integer id) {
        utilisateurService.demanderSuppressionDonnees(id);
        return ResponseEntity.ok("Données supprimées avec succès.");
    }
}
