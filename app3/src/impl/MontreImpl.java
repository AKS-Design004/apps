package impl;
import entity1.Article;
import entity1.Montre;
import entity2.IMontre;

import java.util.Scanner;

public class MontreImpl implements IMontre{
    @Override
    public Montre saisieM() {
        ArticleImpl AI = new ArticleImpl();
        Article A = AI.saisieA();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez saisir la nature: ");
        String nature = scanner.nextLine();
        return new Montre(A.getId(),A.getLib(),nature);
    }

    @Override
    public void affichageM(Montre m) {
        System.out.println("L'ID est: " + m.getId());
        System.out.println("Le libellé est: " + m.getLib());
        System.out.println("La nature est: " + m.getNature());
    }
}
