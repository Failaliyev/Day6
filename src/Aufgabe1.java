//Mövzu: for-each döngüsü
//Məqsəd: Massivdə olan adları bir-bir çap etmək

public class Aufgabe1 {

    public static void main(String[] args) {
        String[ ] namen = {"Anna", "Fail", "Ilkin", "Lukas", "Ivan", "Mehmet"};

        System.out.println("Liste der Teilnehmer");

        //Hər bir adı alıb çap edirik

        for (String name : namen) {

            System.out.println("- " +name);
        }
    }

}
