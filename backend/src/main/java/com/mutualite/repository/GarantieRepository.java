package com.mutualite.repository;

import com.mutualite.model.Garantie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarantieRepository extends JpaRepository<Garantie, Integer> {}
