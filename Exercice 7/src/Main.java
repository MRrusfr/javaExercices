/*Exercice 2 : "L'énigme du nombre parfait"
Un nombre parfait est un nombre qui est égal à la somme de ses diviseurs propres (les diviseurs
strictement inférieurs à lui-même). Par exemple, 6 est un nombre parfait, car ses diviseurs propres
sont 1, 2 et 3, et 1 + 2 + 3 = 6. Votre programme doit déterminer si un nombre donné par l'utilisateur
est un nombre parfait.*/

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        int userNumber;
        do {
            System.out.println("Entrez le nombre parfait:");
            Scanner scanner = new Scanner(System.in);
            userNumber = scanner.nextInt();
            ArrayList<Integer> divisors = new ArrayList<Integer>();
            for (int i = 1; i < userNumber; i++) {
                if (userNumber%i == 0) {
                    divisors.add(i);
                }
            }
            System.out.println(divisors);
            for (Integer num : divisors) {
                sum += num;
            }
        } while (userNumber != sum);
        System.out.println("Votre nombre est parfait");
        }
    }
