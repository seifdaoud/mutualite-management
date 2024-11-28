package com.mutualite.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTasks {

    @Scheduled(cron = "0 0 12 * * ?") // Runs every day at noon
    public void genererRapportQuotidien() {
        System.out.println("Génération du rapport quotidien à 12h00.");
        // Logic for generating daily report
    }
}
