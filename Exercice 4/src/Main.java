/*Exercice 4 : "Le marathon de calculs" (avec tableaux)
Vous travaillez pour une école qui organise un marathon de calculs. Les élèves doivent additionner
une série de nombres entre 1 et un nombre donné par l'utilisateur. De plus, vous devez stocker
chaque résultat partiel de la somme dans un tableau pour le réutiliser plus tard.*/

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        resultStockage();
        System.out.println(stockage);
    }
    static ArrayList<Integer> stockage= new ArrayList<Integer>();

    public static void resultStockage() {
        int userNumber;
        do {
            System.out.println("Entrez votre numero ou '0' pour quiter :");
            Scanner scanner = new Scanner(System.in);
            userNumber = scanner.nextInt();
            int sommeArithmeticProgression = (1 + userNumber)*userNumber/2;
            stockage.add(sommeArithmeticProgression);
        }
        while (userNumber != 0);

    }
}