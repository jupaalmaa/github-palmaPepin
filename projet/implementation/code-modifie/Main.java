// Classes à importer
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Initialisation des variables de classe
    private static TimeLog timeLog = new TimeLog();
    private static Scanner scanner = new Scanner(System.in);
    private static final String FILE_NAME = "activites.json";
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final List<String> DISCIPLINES = List.of("Design01", "Design02", "Implémentation", "Test", "Déploiement");

    public static void main(String[] args) {
        loadFromFile();

        // Menu interactif de l'employé
        boolean running = true;
        while (running) {
            System.out.println("\n1. Démarrer une activité");
            System.out.println("2. Terminer une activité");
            System.out.println("3. Quitter");

            System.out.print("\nChoisissez une option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    startActivitee();
                    break;
                case 2:
                    endActivitee();
                    break;
                case 3:
                    running = false;
                    System.out.println("Écriture en cours [...]");
                    saveToFile();
                    break;
                default:
                    System.out.println("Option invalide. Essayez de nouveau.");
            }
        }
        scanner.close();
    }

    // Initialisation des listes d'employés et de projets
    private static void initializeData() {
        List<Employe> employes = new ArrayList<>();
        List<Projet> projets = new ArrayList<>();
        timeLog.setEmployes(employes);
        timeLog.setProjets(projets);
    }

    // Menu interactif pour debuter une activite
    private static void startActivitee() {
        System.out.print("\nEntrez votre prénom: ");
        String prenomUsager = scanner.nextLine();

        System.out.print("Entrez votre nom: ");
        String nomUsager = scanner.nextLine();

        String idUsager = rechercheEmploye(nomUsager, prenomUsager);

        System.out.print("Entrez l'ID du projet: ");
        int idProjet = scanner.nextInt();
        scanner.nextLine();

        if (!timeLog.projetExiste(idProjet)) {
            System.out.print("Le projet n'existe pas. Voulez-vous créer un nouveau projet? (oui/non): ");
            String reponse = scanner.nextLine();
            if (reponse.equalsIgnoreCase("oui")) {
                System.out.print("Entrez le nom du nouveau projet: ");
                String nomProjet = scanner.nextLine();
                idProjet = timeLog.ajouterProjet(nomProjet);
            } else {
                System.out.println("Erreur : ID projet invalide.");
                return;
            }
        }

        int disciplineChoice = -1;
        while (disciplineChoice < 0 || disciplineChoice >= DISCIPLINES.size()) {
            for (int i = 0; i < DISCIPLINES.size(); i++) {
                System.out.println((i + 1) + ". " + DISCIPLINES.get(i));
            }
            System.out.print("Choisissez une discipline: ");
            disciplineChoice = scanner.nextInt() - 1;
            scanner.nextLine();
            if (disciplineChoice < 0 || disciplineChoice >= DISCIPLINES.size()) {
                System.out.println("Option invalide. Essayez de nouveau.");
            }
        }
        String discipline = DISCIPLINES.get(disciplineChoice);

        timeLog.startActivite(idUsager, idProjet, discipline);
        System.out.println("\n===================\nActivité commencée\n===================\n");
    }

    // Menu interactif pour terminer une activite
    private static void endActivitee() {
        System.out.print("\nEntrez l'ID de l'employé: ");
        String idUsager = scanner.nextLine();

        System.out.print("Entrez l'ID du projet: ");
        int idProjet = scanner.nextInt();
        scanner.nextLine();

        boolean success = timeLog.endActivite(idUsager, idProjet);
        if (success) {
            System.out.println("\n===================\nActivité terminée\n===================\n");
        } else {
            System.out.println("\nErreur : Activité non trouvée ou déjà terminée.");
        }
    }

    // Méthode paramétré pour rechercher un employé
    private static String rechercheEmploye(String nom, String prenom) {
        String idUsager = timeLog.trouverEmploye(nom, prenom);
        if (idUsager == null) {
            idUsager = timeLog.ajouterEmploye(nom, prenom);
        }
        return idUsager;
    }

    // Sauvegarde des donnes dans le fichier JSON
    private static void saveToFile() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            gson.toJson(timeLog, writer);
        } catch (IOException e) {
            System.out.println("\nErreur lors de la sauvegarde des données : " + e.getMessage());
        }
    }

    // Lecture des donnees du fichier JSON
    private static void loadFromFile() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (FileReader reader = new FileReader(file)) {
                Type timeLogType = new TypeToken<TimeLog>(){}.getType();
                timeLog = gson.fromJson(reader, timeLogType);
            } catch (IOException e) {
                System.out.println("\nErreur lors du chargement des données : " + e.getMessage());
            }
        } else {
            initializeData();
        }
    }
}
