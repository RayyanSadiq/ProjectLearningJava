package JavaSmallProjects.MagicCards;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class CardMain {
    public static void main(String[] args) {
        System.out.println("♣❤welcome to MagicalCards♠♦");
        var input = new Scanner(System.in);
        int x = 0;
        var deck = new DeckClass("None");
        while (x<1){
            System.out.println("\n");
            System.out.println("Type any of the commands below: ");
            System.out.println("▶ create ---- This command creates a new deck🗂️");
            System.out.println("▶ shuffle ---- This command randomly shuffles the cards in your deck🔀");
            System.out.println("▶ edit ---- This command allows to delete,add, and move cards around✍️"); // delete and add cards
            System.out.println("▶ sort ---- This command sorts your deck in order♻");
            System.out.println("▶ view ---- This allows you to view your current deck🃏");
            System.out.println("\n");
            CardLibary.processInput(input.nextLine(), deck);



        }
    }
}
