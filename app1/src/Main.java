import entity1.Employe;
import entity1.Etudiant;

public class Main {
    public static void main(String[] args) {
        Employe Em = new Employe();
        Etudiant Et = new Etudiant();
        System.out.println();
        System.out.println("Employe:");
        Em.saisie();
        System.out.println("Les infos de l'employe: ");
        Em.affiche();
        System.out.println("------------------------------");
        System.out.println("Etudiant:");
        Et.saisie();
        System.out.println("Les infos de l'etudiant");
        Et.affiche();

    }
}