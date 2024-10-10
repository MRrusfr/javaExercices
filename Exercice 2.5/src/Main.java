/*Exercice 5 : "Le générateur de mot de passe sécurisé"
Une société vous a demandé de développer un générateur de mot de passe sécurisé. Le
programme doit générer un mot de passe de longueur donnée par l'utilisateur. Le mot de passe doit
contenir des lettres majuscules, des lettres minuscules, des chiffres et des symboles spéciaux. Vous
devez aussi vérifier que le mot de passe généré respecte ces critères.*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Entrez longueur de mot de passe sécurisé:");
        Scanner scanner = new Scanner(System.in);
        int lOfPassword = scanner.nextInt();
        ArrayList<String> passSecure = new ArrayList<String>();
        Random rnd = new Random();
        for (int i = 0; i < lOfPassword + 1; i++) {
            int type = rnd.nextInt(5);
            switch (type){
                case 1:
                    int digit = rnd.nextInt(10);
                    passSecure.add(String.valueOf(digit));
                break;
                case 2:
                    int min = rnd.nextInt(97,123);
                    passSecure.add(Character.toString((char)min));
                    break;
                case 3:
                    int maj = rnd.nextInt(65,91);
                    passSecure.add(Character.toString((char) maj));
                    break;
                case 4:
                    int symbol = rnd.nextInt(33,48);
                    passSecure.add(Character.toString((char) symbol));
                    break;
            }
        }

        String result = String.join("",passSecure);

        System.out.println("Votre mot de passe sécurisé:" + result);
    }

}