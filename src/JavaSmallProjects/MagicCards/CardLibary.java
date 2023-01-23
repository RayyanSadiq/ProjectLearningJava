package JavaSmallProjects.MagicCards;

import java.io.File;
import java.util.Scanner;

public class CardLibary {

    public static void processInput(String command, DeckClass deck) {

        if (command.equals("create")) {
            System.out.println("which model do you want your new deck to be based on? Type one of the card themes below");
            System.out.println("▶ default");
            var input = new Scanner(System.in);
            String theme = input.nextLine();
            var newDeck = new DeckClass(theme);
            deck = newDeck;
            System.out.println("Deck successfully created");
        } else if (command.equals("view")) {


        }


    }



}
