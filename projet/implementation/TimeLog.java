// Classes à importer
import java.time.LocalDateTime;
import java.util.*;

public class TimeLog {
    // Initialisation des variables de classe
    private List<Employe> employes;
    private List<Projet> projets;
    private Map<String, Activite> activitesEnCours = new HashMap<>();

    // Methode pour créer la liste d'employés et de projets
    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }

    // Méthode paramétrée pour déterminer si un employé a déjà une activité en cours
    private boolean EmployeActiviteEnCours(String idEmploye) {
        return activitesEnCours.values().stream()
                .anyMatch(activite -> activite.getIdEmploye().equals(idEmploye) && activite.getDateFin() == null);
    }

    // Méthode paramétrée pour débuter une activité
    public void startActivite(String idEmploye, int idProjet, String discipline) {
        if (EmployeActiviteEnCours(idEmploye)) {
            System.out.println("\nUne activité pour cet employé et ce projet est déjà en cours.");
            return;
        }

        String key = generateKey(idEmploye, idProjet);
        if (!activitesEnCours.containsKey(key)) {
            Activite activite = new Activite(idEmploye, idProjet, discipline);
            activitesEnCours.put(key, activite);
        } else {
            System.out.println("\nUne activité pour cet employé et ce projet est déjà en cours.");
        }
    }

    // Méthode paramétrée pour terminer une activité
    public boolean endActivite(String idEmploye, int idProjet) {
        String key = generateKey(idEmploye, idProjet);
        Activite activite = activitesEnCours.get(key);
        if (activite != null && activite.getDateFin() == null) {
            activite.setEndDate(LocalDateTime.now());
            return true;
        } else {
            return false;
        }
    }

    // Méthode paramétré pour vérifier si l'ID d'employé existe
    boolean employeExiste(String idEmploye) {
        return employes.stream().anyMatch(e -> e.getId().equals(idEmploye));
    }

    // Méthode paramétré pour vérifier si l'ID de projet existe
    boolean projetExiste(int idProjet) {
        return projets.stream().anyMatch(p -> p.getId() == idProjet);
    }

    // Méthode paramétré pour trouver un employé par son nom et prénom
    String trouverEmploye(String nom, String prenom) {
        return employes.stream()
                .filter(e -> e.nom.equals(nom) && e.prenom.equals(prenom))
                .map(Employe::getId)
                .findFirst()
                .orElse(null);
    }

    // Méthode paramétrée pour ajouter un nouvel employé
    String ajouterEmploye(String nom, String prenom) {
        String id = "E" + (employes.size() + 1);
        Employe nouvelEmploye = new Employe(id, nom, prenom);
        employes.add(nouvelEmploye);
        return id;
    }

    // Méthode paramétrée pour ajouter un nouveau projet
    int ajouterProjet(String nom) {
        int id = projets.size() + 1;
        Projet nouveauProjet = new Projet(id, nom);
        projets.add(nouveauProjet);
        return id;
    }

    // Méthode paramétré pour créer une clé dans la HashMap
    private String generateKey(String idEmploye, int idProjet) {
        return idEmploye + "_" + idProjet;
    }
}
