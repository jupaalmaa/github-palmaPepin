import javax.swing.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class TimeLog {
    private List<Employe> employes;
    private List<Projet> projets;
    private Administrateur admin;
    private int nombreHeuresParEmploye;

    public List<Employe> getEmployes(){
        return employes;
    }

    public List<Projet> getProjets() {
        return projets;
    }

    public Administrateur getAdmin() {
        return admin;
    }

    public int getNombreHeuresParEmploye() {
        return nombreHeuresParEmploye;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }

    public void setAdmin(Administrateur admin) {
        this.admin = admin;
    }

    public void setNombreHeuresParEmploye(int nombreHeuresParEmploye) {
        this.nombreHeuresParEmploye = nombreHeuresParEmploye;
    }

    public void logIn(String idUser, String motDePasse) {
        //TODO Code a completer
    }

    public void logOut(String idUser) {
        //TODO Code a completer
    }

    public void startActivitee(String idUser, int idProjet, String discipline) {
        //TODO Code a completer
    }

    public void endActivitee(String idUser, int idProjet) {
        //TODO Code a completer
    }

    public String genererRapportProjet(int idProjet) {
        //TODO Code a completer
        return null;
    }

    public String genererRapportGlobal() {
        //TODO Code a completer
        return null;
    }

    public String genererRapportEmploye(String idUser, Date depuisDate) {
        //TODO Code a completer
        return null;
    }

    public String genererRelevePaie(String idUser) {
        //TODO Code a completer
        return null;
    }

    public String genererRapportTotalSalaire() {
        //TODO Code a completer
        return null;
    }

    public void modifierParametres(int newNombreHeuresParEmploye) {
        //TODO Code a completer
    }
}
