
import java.util.Scanner;

public class Aufgabe5 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {


            System.out.println("Bitte eine Zahl eingeben");

            int zahl = Integer.parseInt(scanner.nextLine());
            System.out.println("Du hast " + zahl + "eingeben.");

        } catch (NumberFormatException e) {

            System.out.println("Ungultige Eingabe! Bitte zur Zahlen verwenden. ");
        }



    }





}
