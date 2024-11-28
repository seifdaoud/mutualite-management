package com.mutualite.service;

import com.mutualite.model.Consentement;
import com.mutualite.repository.ConsentementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsentementService {

    @Autowired
    private ConsentementRepository consentementRepository;

    public List<Consentement> getAllConsentements() {
        return consentementRepository.findAll();
    }

    public Consentement createConsentement(Consentement consentement) {
        return consentementRepository.save(consentement);
    }

    public void revokeConsentement(Integer id) {
        consentementRepository.deleteById(id);
    }
}
