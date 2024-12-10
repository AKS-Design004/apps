package impl;

import entity1.Article;
import entity1.Chemise;
import entity2.IChemise;

import java.util.Scanner;

public class ChemiseImpl implements IChemise {

    @Override
    public Chemise saisieC() {
        ArticleImpl AI = new ArticleImpl();
        Article A = AI.saisieA();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la Couture: ");
        String couture = scanner.nextLine();

        return new Chemise(A.getId(), A.getLib(), couture);
    }

    @Override
    public void affichageC(Chemise c) {
        System.out.println("L'ID est: " + c.getId());
        System.out.println("Le Libellé est: " + c.getLib());
        System.out.println("La couture est: " + c.getCouture());
    }
}
