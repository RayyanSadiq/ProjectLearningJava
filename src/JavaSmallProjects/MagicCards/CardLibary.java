package JavaSmallProjects.MagicCards;

import java.io.File;
import java.util.Scanner;

public class CardLibary {

    public static void processInput(String command, DeckClass deck) {
        var input = new Scanner(System.in);
        if (command.equals("create")) {
            System.out.println("which model do you want your new deck to be based on? Type one of the card themes below");
            System.out.println("\s");
            File dir = new File("src\\JavaSmallProjects\\MagicCards\\DeckModels");

            for (File deckModel:dir.listFiles()){
                System.out.println(deckModel.getName());
            }
            System.out.println("\s");

            String deckModel = capitalize(input.nextLine());

            deck.newDeck(deckModel);

            System.out.println("Deck successfully created");
        }
        else if (command.equals("shuffle")) {
            deck.shuffle();
        }
        else if (command.equals("sort")) {
            deck.sortCards();
        }
        else if (command.equals("view")) {
            int x = 0;
            System.out.println("here are all your cards in your deck");
            while (x<1){
                deck.viewCards();
                System.out.println("\s");
                System.out.println("View Commands:");
                System.out.println("-> get -- you can view a specific card model ");
                System.out.println("-> back -- Go back to main menu");

                String command2 = input.nextLine();
                if (command2.equals("get")){
                    System.out.println("\s");
                    System.out.println("you can check a specific card's model by typing the rank of the card, and then the suit ");
                    System.out.println("Example: 2s = 2 of spades || A of spades == Ace of spades");
                    System.out.println("\s");
                    deck.viewCardModel(input.nextLine());
                } else if (command2.equals("back")) {
                    x = x+1;
                }

            }

        }
    }

    public static String formatTextToEmoji(String str){
        if (str.contains("S")){
            str = str.replace("S","♠");
        }
        else if (str.contains("D")){
            str =str.replace("D","♦");
        }
        else if (str.contains("C")){
            str =str.replace("C","♣");
        }
        else if (str.contains("H")){
            str =str.replace("H","❤");
        }
        return str;
    }

    public static String capitalize(String str){
        str  = str.replaceAll("\\s", "");
        if (str == null || str.isEmpty()){
            return str;
        }

        return str.substring(0,1).toUpperCase() + str.substring(1);

    }





}
