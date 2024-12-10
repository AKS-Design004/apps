package entity1;

import entity2.IProduit;

import java.util.Scanner;

public class ProduitImpl implements IProduit {


    @Override
    public Produit saisie() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez saisir la reference: ");
        String ref = scanner.nextLine();

        System.out.println("Veuillez saisir le libellé: ");
        String libelle = scanner.nextLine();


        System.out.println("Veuillez saisir la quantite: ");
        double quantite= scanner.nextDouble();

        System.out.println("Veuillez saisir le prix: ");
        int prix= scanner.nextInt();

        return new Produit(ref,libelle,quantite,prix);
    }

    @Override
    public void affichage(Produit P) {
        System.out.println("La référence est: " + P.getRef());
        System.out.println("Le libellé est: " + P.getLibelle());
        System.out.println("La quantité est: " + P.getQuantite());
        System.out.println("Le prix est: " + P.getPrix());
    }

}
