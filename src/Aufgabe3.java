
import java.util.Scanner;


public class Aufgabe3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte dein Alter eingeben");

        int alter = scanner.nextInt();

        if (istVolljaehrig(alter)) {


            System.out.println("Du bist volljahrig + ");
        } else


            System.out.println("Du bist noch minderjahrig -");


    }
    public static boolean istVolljaehrig(int alter) {
        return alter >= 18;
    }
}
