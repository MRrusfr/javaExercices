/*Exercice 3 : "Les températures extrêmes"
Un centre météorologique vous demande de développer un programme qui peut enregistrer les
températures sur plusieurs jours dans différentes villes. Le programme doit stocker les températures
dans un tableau à deux dimensions, et ensuite afficher la température la plus élevée et la plus
basse enregistrée.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entrez le nom de la ville: ");
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        HashMap <String, int[]> meteoMap = new HashMap<>();
        int[] antibes = {24, 22, 19, 22, 21, 21, 20};
        int[] paris = {14, 14, 15, 15, 14, 11, };
        int[] stPeter = {10, 14, 11, 10, 8, 8, 9};
        meteoMap.put("Antibes", antibes);
        meteoMap.put("Paris", paris);
        meteoMap.put("St Petersbourg", stPeter);
        if (meteoMap.containsKey(city)){
            System.out.println("la température la plus élevée à " + city + " est " + maxTemp(meteoMap.get(city)));
            System.out.println("la température la plus basse à " + city + " est " + minTemp(meteoMap.get(city)));
        } else {
            System.out.println("Aucune donnée disponible");
        }

    }
    public static int maxTemp (int[] city) {
        int max = 0;
        for (int j : city) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
    public static int minTemp (int[] city) {
        int min = 50;
        for (int j : city) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }

}
