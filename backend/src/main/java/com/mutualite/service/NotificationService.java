package com.mutualite.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void envoyerNotification(String canal, String message, String destinataire) {
        switch (canal) {
            case "EMAIL":
                System.out.println("Envoi d'un email à " + destinataire + ": " + message);
                break;
            case "SMS":
                System.out.println("Envoi d'un SMS à " + destinataire + ": " + message);
                break;
            case "PUSH":
                System.out.println("Envoi d'une notification push à " + destinataire + ": " + message);
                break;
            default:
                System.out.println("Canal inconnu: " + canal);
        }
    }
}
