package com.mutualite.repository;

import com.mutualite.model.Consentement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsentementRepository extends JpaRepository<Consentement, Integer> {
}
