import java.util.Scanner;

public class Exercice56 {
    public static int verifier() {
        int resultat;
        Scanner lectureClavier = new Scanner(System.in);
        do {
            System.out.print("Entrer un entier : ");
            resultat = lectureClavier.nextInt();
        } while (resultat < 0 || resultat > 100);

        return resultat;
    }

    public static int verifierAvecBornes(int a, int b) {
        int resultat;
        Scanner lectureClavier = new Scanner(System.in);
        do {
            System.out.print("Entrer un entier : ");
            resultat = lectureClavier.nextInt();
        } while (resultat < a || resultat > b);
        return resultat;
    }

    public static void main(String[] args) {
        int valeur;
        valeur = verifier();
        System.out.println("valeur : " + valeur);
        valeur = verifierAvecBornes(10, 20);
        System.out.println("valeur : " + valeur);
    }
}

