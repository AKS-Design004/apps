
import entity1.Chemise;
import entity1.Montre;
import impl.ChemiseImpl;
import impl.MontreImpl;

public class Main {
    public static void main(String[] args) {
        ChemiseImpl C1 = new ChemiseImpl();
        MontreImpl M2 = new MontreImpl();

        System.out.println("CHEMISE: ");
        Chemise C=C1.saisieC();
        System.out.println("Les infos de la chemise :");
        C1.affichageC(C);
        System.out.println("-----------------------------");
        System.out.println("MONTRE: ");
        Montre M = M2.saisieM();
        System.out.println("Les infos de la nature :");
        M2.affichageM(M);
    }
        }
