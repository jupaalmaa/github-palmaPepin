public class Administrateur {
    private String user;
    private String motDePasse;

    public String getUser() {
        return user;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void assignerEmployeAProjet(int idEmploye, String idProjet) {
        //TODO Code a completer
    }

    public void modifierDetailsProjet(int idProjet, String details) {
        //TODO Code a completer
    }

    public void modifierDetailsEmploye(int idEmploye, String details) {
        //TODO Code a completer
    }

    public void changerUser(String newUser) {
        //TODO Code a completer
    }

    public void changerMotDePasse(String newMotDePasse) {
        //TODO Code a completer
    }
}
