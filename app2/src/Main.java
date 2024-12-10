import entity1.Produit;
import entity1.ProduitImpl;

public class Main {
    public static void main(String[] args) {

        ProduitImpl P1 = new ProduitImpl();


        Produit P = P1.saisie();

        P1.affichage(P);

    }
}