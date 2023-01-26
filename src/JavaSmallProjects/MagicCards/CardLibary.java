package JavaSmallProjects.MagicCards;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CardLibary {

    public static void processInput(String command, DeckClass deck) {

        if (command.equals("Create")) {
            create(deck);
        }
        else if (command.equals("Shuffle")) {
            deck.shuffle();
        }
        else if (command.equals("Edit")) {
            edit(deck);
        }
        else if (command.equals("Sort")) {
            deck.sortCards();
        }
        else if (command.equals("View")) {
            view(deck);
        }
        else {
            cueAudio("error");
            System.out.println("That's not a valid command, try again.");
        }
    }

    public static void create(DeckClass deck){
        var input = new Scanner(System.in);
        cueAudio("sound1");

        System.out.println("Which model do you want your new deck to be based on? Type one of the card themes below:");
        displayModelsAvailable();

        String deckModel = capitalize(input.nextLine());

        int count = 0;
        ClassicCardClass [] cards = new ClassicCardClass[deck.getMaxCards()];
        for (int x = 0; x < deck.getSuits().length; x++) {
            for (int y = 0; y < deck.getRanks().length; y++) {
                cards[count] = new ClassicCardClass(deck.getRanks()[y] + deck.getSuits()[x], deckModel);
                count++;
            }
        }
        deck.setDeck(cards);

        cueAudio("sound2");
        System.out.println("Deck successfully created!");

    }

    public static void edit(DeckClass deck){
        var input = new Scanner(System.in);
        cueAudio("sound1");

        int x = 0;
        while (x<1){
            System.out.println("Here are the commands for editing your deck:");
            System.out.println("▶ Remove➖ ---- This command will ask the card you want to remove");
            System.out.println("▶ Add➕ ---- This command will ask what type of card to add to your current deck");
            System.out.println("▶ Back ---- Head back to main menu");
            String command = capitalize(input.nextLine());

            if (command.equals("Add")){
                add(deck);
                x =+ 1;
            }
            else if (command.equals("Remove")) {
                remove(deck);
                x =+ 1;
            }
            else if (command.equals("Back")){
                x =+ 1;
            }
            else {
                cueAudio("error");
                System.out.println("That's not a valid command, try again.");
            }
        }
    }
    public static void add(DeckClass deck){
        var input = new Scanner(System.in);

        int nullCount = 0;
        for (int i = 0; i<deck.getMaxCards();i++){
            if (deck.getCards()[i] == null){
                nullCount++;
            }
        }

        if (nullCount>0){
            System.out.println("▶ What type of card would you like to add? Type the card's name like the  given examples below:");
            System.out.println("Example: 5C = 5 of Clubs || J of spades == joker of Spades");
            String cardName = (input.nextLine().replaceAll("\\s", "")).toUpperCase();
            String suit = deck.suitChecker(cardName);
            String rank = deck.rankChecker(cardName);
            System.out.println("Which model do you want on your new card?");
            displayModelsAvailable();
            var newCard = new  ClassicCardClass(rank+suit, capitalize(input.nextLine()));
            deck.add(newCard);
            System.out.println("Card successfully added!");

        }
        else {
            cueAudio("error");
            System.out.println("There are no spaces left in your deck, try removing some cards to make some.");
        }
    }

    public static void remove(DeckClass deck){
        var input = new Scanner(System.in);
        System.out.println("▶ which do you want to remove?");
        deck.remove(input.nextLine());
    }

    public static void view(DeckClass deck){
        var input = new Scanner(System.in);
        int x = 0;
        System.out.println("Here are all your cards in your deck");

        while (x<1) {
            deck.viewCards();
            System.out.println("\s");
            System.out.println("View Commands:");
            System.out.println("▶ Get ---- You can view a specific card model ");
            System.out.println("▶ Change ---- This command offers model customization");
            System.out.println("▶ Back ---- Go back to main menu");

            String command = capitalize(input.nextLine());
            if (command.equals("Get")) {
                System.out.println("\s");
                System.out.println("You can check a specific card's model by typing the rank of the card, and then the suit ");
                System.out.println("Example: 2s = 2 of spades || A of spades == Ace of spades");
                System.out.println("\s");
                deck.viewCardModel(input.nextLine());
            } else if (command.equals("Change")) {
                 change(deck);

            } else if (command.equals("Back")) {
                x = x + 1;
            } else {
                cueAudio("error");
                System.out.println("That's not a valid command, try again.");
            }
        }
    }

    public static void change(DeckClass deck){
        var input = new Scanner(System.in);
        int y = 0;

        while (y < 1) {
            System.out.println("Do you want to change all the cards in your deck, or a specific card?");
            System.out.println("▶ Deck");
            System.out.println("▶ card");
            String command = capitalize(input.nextLine());
            if (capitalize(command ).equals("Deck")) {
                System.out.println("Which model do you want to set all your cards to?");
                displayModelsAvailable();
                deck.setCards(capitalize(input.nextLine()));
                y = +1;
            } else if (capitalize(command ).equals("Card")) {
                System.out.println("Type the name of the card that you want to change?");
                System.out.println("Example: Ks = King of spades || 10d == 10 of diamond");
                String cardName = input.nextLine();
                System.out.println("Which model do you want to set this card to?");
                displayModelsAvailable();
                deck.setCard(cardName, capitalize(input.nextLine()));
                y = +1;
            }
            else {
                cueAudio("error");
                System.out.println("That's not a valid command, try again.");
            }
        }
    }

    public static void displayModelsAvailable(){
        File dir = new File("src\\JavaSmallProjects\\MagicCards\\DeckModels");

        System.out.println("\s");
        for (File deckModel:dir.listFiles()){
            System.out.println("▶ " +deckModel.getName());
        }
        System.out.println("\s");
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
        str = str.toLowerCase();
        str  = str.replaceAll("\\s", "");
        if (str == null || str.isEmpty()){
            return str;
        }
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    public static void cueAudio(String str){
        try {
            var audio = new AudioPlayer(str);
            audio.play();
        } catch (Exception e) {
            System.out.println("Error with playing sound.");
            e.printStackTrace();
        }
    }

}
