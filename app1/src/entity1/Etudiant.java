package entity1;

import entity2.IPersonne;

import java.util.Scanner;

public class Etudiant extends Personne implements IPersonne {

    private String matricule;
    private double moyenne;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, String matricule, double moyenne) {
        super(nom, prenom);
        this.matricule = matricule;
        this.moyenne = moyenne;
    }

    public String getMatricule() {
        return matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    private String geneMatricule(){
        String mat;
        mat="Mat-" + this.nom.charAt(0) + this.prenom.charAt(0);
        return mat.toUpperCase();
    }

    @Override
    public void saisie() {
        saisiP();
        matricule = geneMatricule();
        Scanner scanner=new Scanner(System.in);
    do {
        System.out.println("Veuillez saisir la moyenne :");
        moyenne=scanner.nextDouble();
    }while(moyenne < 0 || moyenne > 20);

    }

    @Override
    public void affiche() {
        System.out.println("Son matricule est: " + this.matricule.toUpperCase());
        System.out.println("Son nom est: " + this.nom);
        System.out.println("Son prenom est: " + this.prenom);
        System.out.println("Sa moyenne est: " + this.moyenne);
    }
}
