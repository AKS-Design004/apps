package entity1;

import java.util.Scanner;

public class Personne {
    protected String nom,prenom;

    public Personne() {
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrennom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrennom(String prenom) {
        this.prenom = prenom;
    }

    public void saisiP(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez saisir le nom: ");
        nom = scanner.nextLine();

        System.out.println("Veuillez saisir le prenom: ");
        prenom = scanner.nextLine();

    }
}
