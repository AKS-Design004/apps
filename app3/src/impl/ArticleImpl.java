package impl;

import entity1.Article;
import entity2.IArticle;

import java.util.Scanner;

public class ArticleImpl implements IArticle {

    @Override
    public Article saisieA() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez saisir l'ID: ");
        int Id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Veuillez saisir le libelle: ");
        String lib = scanner.nextLine();
        return new Article(Id,lib);
    }
    @Override
    public void affichageA(Article a) {
        System.out.println("L'ID est: " + a.getId());
        System.out.println("Le libelle est: " + a.getLib());
    }
}
