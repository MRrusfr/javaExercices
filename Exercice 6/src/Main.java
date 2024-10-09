/*Exercice 1 : "Le calculateur de moyenne"
Vous êtes chargé de concevoir un programme pour une école qui veut automatiser le calcul des
moyennes de plusieurs élèves. Chaque élève a plusieurs notes, et le programme doit calculer la
moyenne de chaque élève, ainsi que la moyenne générale de toute la classe.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        students.add("Harmony Hester");
        students.add("Jaylen Ochoa");
        students.add("Adrianna Cervantes");
        students.add("Tyler Hickman");
        students.add("Ashlynn Baxter");
        double sum = 0;
        for (int i = 0; i < students.size() - 1; i++) {
            Double studentsNote = getNote(students.get(i));
            sum += studentsNote;
            cpa.put(students.get(i), studentsNote);
        }

        Double avgNote = sum/cpa.size();
        System.out.println("Moyenne note pour la classe:"  + avgNote);
    }

    static ArrayList<String> students= new ArrayList<String>();
    static HashMap<String, Double> cpa = new HashMap<>();
    public static Double getNote(String student) {
        ArrayList<Integer> notes= new ArrayList<Integer>();
        int note;
        do {
            System.out.println("Entrez le note pour l'etudiant:" + student);
            Scanner scanner = new Scanner(System.in);
            note = scanner.nextInt();
            notes.add(note);
        }
        while (note != 0);
        double sum = 0;
        for (Integer mark : notes) {
            sum += mark;
        }
        Double avgNote = sum/notes.size();
        System.out.println("Des notes de pour l'etudiant " + student + " : " + notes);
        System.out.println("Moyenne note pour l'etudiant " + student + " : " + avgNote);
        return avgNote;
    }
}