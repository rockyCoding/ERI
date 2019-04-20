import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Backpacker {

    public static HashSet<String> backpack = new HashSet<>();


    public static void main(String[] args) {
        System.out.println("Dies ist das Spiel \"Ich pack in meinen Rucksack...\".");
        System.out.println("Packe etwas in deinen Rucksack, dein Mitspieler muss dann alles im Rucksack aufzählen, bevor er auch etwas hinein packen kann.");
        boolean end = false;
        boolean inDone = false;
        int given = 0, remembered = 0;
        String input;
        Scanner scanner = new Scanner(System.in);
        Set<String> checked = new HashSet<>();

        do{
            do {
                System.out.println("Was soll in den Rucksack?");
                input = scanner.nextLine().toLowerCase();
                if (backpack.add(input)) {
                    System.out.print("Eingepackt, gib jetzt an einen Kollegen weiter.");
                    inDone = true;
                }
                else {
                    System.out.println("Gegenstand war bereits in Rucksack. Nimm einen anderen.");
                }
            }while (!inDone);

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Zähle jetzt bitte alle Gegenstände auf die bereits im Rucksack sind:");
            do{
                input = scanner.nextLine().toLowerCase();
                if (checked.add(input)) {
                    if (backpack.contains(input)) {
                        remembered++;
                    } else {
                        System.out.println("Sorry, \"" + input + "\" war nicht im Rucksack.");
                        System.out.println("Du hattest" + remembered + " von " + backpack.size() + "richtig.");
                        System.out.println("Damit ist dieses Spiel leider zu Ende. Starte es erneut, wenn du nochmal spielen willst.");
                        end = true;
                        given = backpack.size();
                    }
                    given++;
                } else  {
                    System.out.println("Diesen Gegenstand hast du bereits genannt.");
                }
            }while((given<backpack.size()));
        }while(!end);
    }
}
