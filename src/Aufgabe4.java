import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int zufallszahl = (int)(Math.random() * 5) + 1; 
        int versuch;

        System.out.println("Ich denke an eine Zahl zwischen 1 und 5. Rate sie!");

 
        do {
            System.out.print("Dein Versuch: "); 
            versuch = scanner.nextInt();        

            if (versuch != zufallszahl) {
                System.out.println("Falsch, versuche es erneut!");
            }

        } while (versuch != zufallszahl); //

        System.out.println("Richtig geraten! Die Zahl war: " + zufallszahl);
    }
}
