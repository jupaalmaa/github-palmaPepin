import java.util.Date;
import java.util.List;

public class Employe {
    private int idEmploye;
    private String nomUsager;
    private Date dateEmbauche;
    private Date dateDepart;
    private double salaireHoraire;
    private double salaireOvertime;
    private String numeroAssuranceSociale;
    private String poste;
    private List<Activite> activitees;

    public int getIdEmploye() {
       return idEmploye;
    }

    public String getNom() {
        return nomUsager;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public double getSalaireHoraire() {
        return salaireHoraire;
    }

    public double getSalaireOvertime() {
        return salaireOvertime;
    }

    public String getNumeroAssuranceSociale() {
        return numeroAssuranceSociale;
    }

    public String getPoste() {
        return poste;
    }

    public List<Activite> getActivitees() {
        return activitees;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public void setNomUsager(String nomUsager) {
        this.nomUsager = nomUsager;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public void setSalaireHoraire(double salaireHoraire) {
        this.salaireHoraire = salaireHoraire;
    }

    public void setSalaireOvertime(double salaireOvertime) {
        this.salaireOvertime = salaireOvertime;
    }

    public void setNumeroAssuranceSociale(String numeroAssuranceSociale) {
        this.numeroAssuranceSociale = numeroAssuranceSociale;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public void setActivitees(List<Activite> activitees) {
        this.activitees = activitees;
    }

    public void logIn(String motDePasse) {
        //TODO Code a completer
    }

    public void logOut() {
        //TODO Code a completer
    }

    public void startActivitee(int idProjet, String discipline) {
        //TODO Code a completer
    }

    public void endActivitee(int idProjet) {
        //TODO Code a completer
    }

    public void demanderHeuresTravaillees(Date depuisDate) {
        //TODO Code a completer
    }

    public String genererRelevePaie() {
        //TODO Code a completer
        return null;
    } 
}
