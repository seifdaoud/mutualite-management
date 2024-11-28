package com.mutualite.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class PredictionService {

    public String lancerPrediction(Integer contratId) {
        try {
            Process process = Runtime.getRuntime().exec("python3 prediction.py " + contratId);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "Erreur lors de l'exécution du script de prédiction";
        }
    }
}
