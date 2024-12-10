package entity1;

import entity2.IPersonne;

import java.util.Scanner;

public class Employe extends Personne implements IPersonne {
    private String fonction;
    private int salaire;

    public Employe() {
    }

    public Employe(String nom, String prenom, String fonction, int salaire) {
        super(nom, prenom);
        this.fonction = fonction;
        this.salaire = salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void saisie() {
        saisiP();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez saisir la fonction: ");
        fonction=scanner.nextLine();
        do {
            System.out.println("Veuillez saisir le salaire: ");
            salaire=scanner.nextInt();
        }while (salaire<=0);

    }

    @Override
    public void affiche() {
        System.out.println("Son nom est: " + this.nom);
        System.out.println("Son prenom est: " + this.prenom);
        System.out.println("Sa fonction est: " + this.fonction);
        System.out.println("Son salaire est: " + this.salaire);
    }
}
