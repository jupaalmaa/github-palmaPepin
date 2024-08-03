import java.util.Date;

public class PayInfo {
    private int idEmploye;
    private double heuresBase;
    private double heuresOvertime;
    private double salaireHoraire;
    private double salaireOvertime;
    private Date debutPeriodePaie;
    private Date finPeriodePaie;

    public int getIdEmploye() {
        return idEmploye;
    }

    public double getHeuresBase() {
        return heuresBase;
    }

    public double getHeuresOvertime() {
        return heuresOvertime;
    }

    public double getSalaireHoraire() {
        return salaireHoraire;
    }

    public double getSalaireOvertime() {
        return salaireOvertime;
    }

    public Date getDebutPeriodePaie() {
        return debutPeriodePaie;
    }

    public Date getFinPeriodePaie() {
        return finPeriodePaie;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public void setHeuresBase(double heuresBase) {
        this.heuresBase = heuresBase;
    }

    public void setHeuresOvertime(double heuresOvertime) {
        this.heuresOvertime = heuresOvertime;
    }

    public void setSalaireHoraire(double salaireHoraire) {
        this.salaireHoraire = salaireHoraire;
    }

    public void setSalaireOvertime(double salaireOvertime) {
        this.salaireOvertime = salaireOvertime;
    }

    public void setDebutPeriodePaie(Date debutPeriodePaie) {
        this.debutPeriodePaie = debutPeriodePaie;
    }

    public void setFinPeriodePaie(Date finPeriodePaie) {
        this.finPeriodePaie = finPeriodePaie;
    }

    public double getPaieNet() {
        //TODO Code a completer
        return 0; //valeur temporaire
    }

    public String getRapportDeductions() {
        //TODO Code a completer
        return ""; //valeur temporaire
    }
}
