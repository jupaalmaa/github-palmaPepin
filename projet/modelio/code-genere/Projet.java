import java.util.Date;
import java.util.List;
import java.util.HashMap;

public class Projet {
    private int idProjet;
    private String nomProjet;
    private Date dateDebut;
    private Date dateFin;
    private HashMap<String, Double> heuresBudgetees;
    private List<Employe> employes;

    public int getIdProjet() {
        return idProjet;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public HashMap<String, Double> getHeuresBudgetes() {
        return heuresBudgetees;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setHeuresBudgetees(HashMap<String, Double> heuresBudgetees) {
        this.heuresBudgetees = heuresBudgetees;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public void ajouterEmployes(Employe employe) {
        //TODO Code a completer
    }

    public void enleverEmployes(int idEmploye) {
        //TODO Code a completer
    }

    public void logActivitee(int idEmploye, String discipline, Date heureDebut, Date heureFin) {
        //TODO Code a completer
    }

    public String genererRapport() {
        //TODO Code a completer
        return null;
    }
}
