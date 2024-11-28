# **Health Mutual Project**

## **Description**
Ce projet est une application complète de gestion de mutuelle santé, développée en **Spring Boot** (backend) et **Angular** (frontend). Elle offre des fonctionnalités pour gérer les utilisateurs, contrats, garanties, factures, notifications multicanaux, rapports interactifs et prédictions basées sur l'IA.

---

## **Fonctionnalités Principales**
### **Backend : Spring Boot**
- **Gestion des Utilisateurs :**
  - Inscription, connexion et gestion des rôles (administrateur, gestionnaire, adhérent).
- **Contrats et Garanties :**
  - Création, modification et gestion des contrats et garanties.
- **Factures :**
  - Génération automatique avec Quartz Scheduler.
  - Suivi des paiements et rappels.
- **Notifications Multicanaux :**
  - Notifications via email, SMS et push.
- **Rapports et Export PDF :**
  - Génération de rapports dynamiques avec exportation.
- **Prédictions basées sur l'IA :**
  - Analyse des données historiques pour prédire le renouvellement des contrats.
- **Planification Automatique :**
  - Quartz Scheduler pour tâches périodiques (e.g., génération de rapports).
  
### **Frontend : Angular**
- **Interface Utilisateur :**
  - Visualisation et modification des contrats, garanties, et factures.
- **Prédictions :**
  - Affichage des probabilités de renouvellement basées sur l’IA.
- **Rapports :**
  - Graphiques interactifs avec Chart.js.
  - Téléchargement des rapports PDF.
- **Gestion des Préférences de Notifications :**
  - Configuration personnalisée des canaux (email, SMS, push).

---

## **Installation**

### **Prérequis**
- **Backend** :
  - JDK 17+
  - Maven 3.6+
  - MySQL/PostgreSQL
- **Frontend** :
  - Node.js 16+
  - Angular CLI
- **Autres :**
  - Docker (pour conteneurisation)

### **Étapes d'Installation**

#### **Backend**
1. Clonez le projet :
   ```bash
   git clone <votre-repository-git>
   cd health-mutual-project/backend
   ```
2. Configurez la base de données dans `application.properties` :
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/mutualite
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Lancez l'application :
   ```bash
   mvn spring-boot:run
   ```

#### **Frontend**
1. Accédez au dossier frontend :
   ```bash
   cd ../frontend
   ```
2. Installez les dépendances :
   ```bash
   npm install
   ```
3. Lancez l'application Angular :
   ```bash
   ng serve
   ```
4. Accédez à l'application dans le navigateur : `http://localhost:4200`.

---

## **Endpoints Principaux**
### **Backend**
- `GET /api/utilisateurs` : Liste des utilisateurs.
- `POST /api/contrats` : Créer un contrat.
- `GET /api/garanties` : Liste des garanties.
- `GET /api/factures` : Liste des factures.
- `POST /api/rapports` : Générer un rapport.

### **Frontend**
- `/contrats` : Gestion des contrats.
- `/factures` : Gestion des factures.
- `/rapports` : Visualisation des rapports.
- `/notifications` : Gestion des préférences de notifications.

---

## **Tests**
### **Backend**
- Tests unitaires avec JUnit :
  ```bash
  mvn test
  ```
- Tests d’intégration pour les endpoints REST.

### **Frontend**
- Tests avec Jasmine :
  ```bash
  ng test
  ```
- Tests end-to-end avec Cypress.

---

## **Déploiement**
1. **Docker Compose** :
   - Conteneurisez le backend et le frontend avec Docker Compose.
   - Exemple de fichier `docker-compose.yml` :
     ```yaml
     version: "3.8"
     services:
       backend:
         build: ./backend
         ports:
           - "8080:8080"
         environment:
           - SPRING_DATASOURCE_URL=jdbc:mysql://db:3306/mutualite
       frontend:
         build: ./frontend
         ports:
           - "4200:80"
       db:
         image: mysql:8.0
         environment:
           MYSQL_ROOT_PASSWORD: root
           MYSQL_DATABASE: mutualite
    
