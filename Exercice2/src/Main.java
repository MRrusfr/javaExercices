import java.util.Scanner;

/*Vous êtes en charge de la sécurité d'un musée. Le musée ne peut accueillir que des personnes
majeures (18 ans ou plus) pendant certaines expositions. Vous devez créer un programme pour
vérifier l'âge des visiteurs et décider s'ils peuvent entrer.*/


public class Main {
    public static void main(String[] args) {
        isAdalt();
    }
    public static void isAdalt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Votre age :");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Bienvenue sur l'expositions");
        } else {
            System.out.println("L'acces est interdit");
        }
    }
}