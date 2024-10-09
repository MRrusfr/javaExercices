/*Exercice 5 : "L'énigme du coffre-fort" (avec tableaux)
Un coffre-fort contient un trésor, mais il ne s'ouvrira que si un certain mot de passe est trouvé. Ce
mot de passe est une chaîne de caractères spécifique que l'utilisateur doit deviner. Le programme
doit également stocker chaque tentative de mot de passe dans un tableau et afficher toutes les
tentatives incorrectes à la fin.*/

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String password = "";
        isCorrect(password);
    }

    static ArrayList<String> stockage= new ArrayList<String>();
    static final String correctPassword = "ibCegos2024";

    public static void isCorrect(String password) {
        do {
            System.out.println("Entrez votre le pass :");
            Scanner scanner = new Scanner(System.in);
            password = scanner.next();
            stockage.add(password);
        }
        while (!password.equals(correctPassword));

        System.out.println(stockage);



    }
}