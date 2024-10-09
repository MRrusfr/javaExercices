/*Exercice 3 : "La salle des trésors"
Le gardien d'une salle des trésors vous demande de concevoir un système qui puisse afficher
chaque jour le nombre de trésors comptabilisés. À chaque fois qu'un trésor est compté, il faut
l'afficher sur l'écran avec une description spéciale pour les trésors comptés à des positions multiples
de 3.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        tresoreCounter();
    }
    public static void tresoreCounter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quatité des trésors :");
        int qty = scanner.nextInt();
        for (int i = 0; i < qty; i++) {
            System.out.println("Numero : " + i );
            if (i%3 == 0) {
                System.out.println("Description de numero" + i);
            }
        }

    }
}