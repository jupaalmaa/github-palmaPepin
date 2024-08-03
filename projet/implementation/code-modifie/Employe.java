public class Employe {
    // Initialisation des variables de classe
    private String id;
    String nom;
    String prenom;

    // Méthode paramétrée pour la création d'un employé
    public Employe(String id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Methode pour GET le ID d'un employé
    public String getId() {
        return id;
    }
}
