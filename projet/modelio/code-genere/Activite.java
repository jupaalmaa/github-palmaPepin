import java.util.Date;

public class Activite {
    private int idActivitee;
    private int idProjet;
    private String discipline;
    private Date heureDebut;
    private Date heureFin;

    public int getIdActivitee() {
        return idActivitee;
    }

    public int getIdProjet() {
        return idProjet;
    }

    public String getDiscipline() {
        return discipline;
    }

    public Date getHeureDebut() {
        return heureDebut;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public void setIdActivitee(int idActivitee) {
        this.idActivitee = idActivitee;
    }

    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

    public void startActivitee() {
        //TODO Code a completer
    }

    public void endActivitee() {
        //TODO Code a completer
    }
}
