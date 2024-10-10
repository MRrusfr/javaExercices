/*Exercice 4 : "Le traducteur de chiffres romains"
Votre client vous demande de concevoir un programme capable de convertir des chiffres arabes
(par exemple 1987) en chiffres romains (par exemple MCMLXXXVII). Le programme doit demander
à l'utilisateur un nombre et ensuite afficher son équivalent en chiffres romains.*/

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Entrez l'année:");
        Scanner scanner = new Scanner(System.in);
        char[] userAnnee = scanner.nextLine().toCharArray();
        ArrayList<String> anneeRomain = new ArrayList<String>();
        switch (userAnnee[0]){
            case '1':
                anneeRomain.add("M");
                break;
            case '2':
                anneeRomain.add("MM");
                break;
        }
        switch (userAnnee[1]){
            case '1':
                anneeRomain.add("C");
                break;
            case '2':
                anneeRomain.add("CC");
                break;
            case '3':
                anneeRomain.add("CCC");
                break;
            case '4':
                anneeRomain.add("CD");
                break;
            case '5':
                anneeRomain.add("D");
                break;
            case '6':
                anneeRomain.add("DC");
                break;
            case '7':
                anneeRomain.add("DCC");
                break;
            case '8':
                anneeRomain.add("DCCC");
                break;
            case '9':
                anneeRomain.add("CM");
                break;
            case '0':
                break;
        }

        switch (userAnnee[2]){
            case '1':
                anneeRomain.add("X");
                break;
            case '2':
                anneeRomain.add("XX");
                break;
            case '3':
                anneeRomain.add("XXX");
                break;
            case '4':
                anneeRomain.add("XL");
                break;
            case '5':
                anneeRomain.add("L");
                break;
            case '6':
                anneeRomain.add("LX");
                break;
            case '7':
                anneeRomain.add("LXX");
                break;
            case '8':
                anneeRomain.add("LXXX");
                break;
            case '9':
                anneeRomain.add("XC");
                break;
            case '0':
                break;
        }

        switch (userAnnee[3]){
            case '1':
                anneeRomain.add("I");
                break;
            case '2':
                anneeRomain.add("II");
                break;
            case '3':
                anneeRomain.add("III");
                break;
            case '4':
                anneeRomain.add("IV");
                break;
            case '5':
                anneeRomain.add("V");
                break;
            case '6':
                anneeRomain.add("VI");
                break;
            case '7':
                anneeRomain.add("VII");
                break;
            case '8':
                anneeRomain.add("VIII");
                break;
            case '9':
                anneeRomain.add("IX");
                break;
            case '0':
                break;
        }
        String result = String.join("",anneeRomain);

        System.out.println("Votre annee en chiffres romains :" + result);
    }

}
