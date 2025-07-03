
import java.util.Scanner;

public class Aufgabe2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte deinen Namen eingeben: ");

        String name = scanner.nextLine();

        if (name.startsWith("F") && name.endsWith("L")) {

            System.out.println("Dein Name beginnt mit F und endet L");

        } else {

            System.out.println("Dein Name erfüllt die Bedungung nicht");
        }


    }


}
