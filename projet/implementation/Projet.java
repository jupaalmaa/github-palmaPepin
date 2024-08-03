public class Projet {
    // Initialisation des variables de classe
    private int id;
    private String nom;

    // Méthode paramétrée pour la création d'un projet
    public Projet(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Methode pour GET le ID d'un projet
    public int getId() {
        return id;
    }
}
