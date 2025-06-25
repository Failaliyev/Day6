import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int zufallszahl = (int)(Math.random() * 5) + 1; // 1–5 arası təsadüfi ədəd seçilir
        int versuch;

        System.out.println("Ich denke an eine Zahl zwischen 1 und 5. Rate sie!");

        // do-while ilə istifadəçiyə bir neçə cəhd imkanı veririk
        do {
            System.out.print("Dein Versuch: "); // təxmin istəyirik
            versuch = scanner.nextInt();        // istifadəçi daxil edir

            if (versuch != zufallszahl) {
                System.out.println("Falsch, versuche es erneut!");
            }

        } while (versuch != zufallszahl); //

        System.out.println("Richtig geraten! Die Zahl war: " + zufallszahl);
    }
}
