// Classes à importer
import java.time.LocalDateTime;

public class Activite {
    // Initialisation des variables de classe
    private String idEmploye;
    private int idProjet;
    private String discipline;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;

    // Méthode paramétrée pour la création d'une activité
    public Activite(String idEmploye, int idProjet, String discipline) {
        this.idEmploye = idEmploye;
        this.idProjet = idProjet;
        this.discipline = discipline;
        this.dateDebut = LocalDateTime.now();
    }

    // Méthodes d'accès
    public String getIdEmploye() {
        return idEmploye;
    }

    // Methode pour GET la date de fin d'activité
    public LocalDateTime getDateFin() {
        return dateFin;
    }

    // Methode pour SET la date de fin d'activité
    public void setEndDate(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }
}
