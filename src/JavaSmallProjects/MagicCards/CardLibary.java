package JavaSmallProjects.MagicCards;

import java.io.File;
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
            sort(deck);
        }
        else if (command.equals("View")) {
            view(deck);

        } else if (command.equals("Settings")) {
            settings(deck);
        }
        else {
            deck.cueAudio("error");
            System.out.println("That's not a valid command, try again.");
        }
    }

    private static void sort(DeckClass deck) {
        deck.sortCards();
        boolean isCard = false;
        for (int i = 0; i < deck.getCards().length; i++ ){
            if (deck.getCards()[i] != null){
                isCard = true;
                break;
            }
        }
        if(isCard){
            deck.cueAudio("shuffle");
            System.out.println("Deck has been successfully sorted");
        } else {
            deck.cueAudio("error");
            System.out.println("There are no cards to shuffle");
        }
    }

    private static void settings(DeckClass deck) {
        var input = new Scanner(System.in);
        deck.cueAudio("proceed");

        int x = 0;
        while (x<1){
            System.out.println("\s");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("Settings:  | Status:      | Command:     ");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("   audio   | "+(deck.getAudioStatus() ? "on ":"off")+ "           | /toggle audio");
            System.out.println("   icons   | "+(deck.getIconFormat() ? "on ":"off") + "           | /toggle icons");
            System.out.println(" auto-sort | "+(deck.getAutoSort() ? "on ":"off") + "           | /toggle sort");
            System.out.println("           |               |              ");
            System.out.println("\s");
            System.out.println("▶ Back ---- Head back to main menu");

            String command = capitalize(input.nextLine());
            if (command.equals("Toggleaudio")){
                deck.toggleAudio();
                deck.cueAudio("toggle");
            } else if (command.equals("Toggleicons")) {
                deck.toggleIconFormat();
                deck.cueAudio("toggle");
            } else if (command.equals("Togglesort")) {
                deck.toggleAutoSort();
                deck.cueAudio("toggle");
            } else if (command.equals("Back")){
                deck.cueAudio("back");
                x =+ 1;
            }
        }
    }

    public static void create(DeckClass deck){
        var input = new Scanner(System.in);

        String deckModel = selectModel(deck);
        if (deckModel.equals("Back")){
            deck.cueAudio("back");
        }
        else {
            int count = 0;
            ClassicCardClass [] cards = new ClassicCardClass[deck.getMaxCards()];
            for (int x = 0; x < deck.getSuits().length; x++) {
                for (int y = 0; y < deck.getRanks().length; y++) {
                    cards[count] = new ClassicCardClass(deck.getRanks()[y] + deck.getSuits()[x], deckModel);
                    count++;
                }
            }
            deck.setDeck(cards);
            deck.cueAudio("success");
            System.out.println("Deck successfully created!");
        }
    }

    public static void edit(DeckClass deck){
        var input = new Scanner(System.in);
        deck.cueAudio("proceed");

        int x = 0;
        while (x<1){
            System.out.println("Here are the commands for editing your deck:");
            System.out.println("▶ Remove➖ ---- This command will ask the card you want to remove");
            System.out.println("▶ Add➕ ---- This command will ask what type of card to add to your current deck");
            System.out.println("▶ Back ---- Head back to main menu");
            String command = capitalize(input.nextLine());

            if (command.equals("Add")){
               addCard(deck);

            }
            else if (command.equals("Remove")) {
                remove(deck);

            }
            else if (command.equals("Back")){
                deck.cueAudio("back");
                x =+ 1;
            }
            else {
                deck.cueAudio("error");
                System.out.println("That's not a valid command, try again.");
            }
        }
    }

    public static void addCard(DeckClass deck ){
        var input = new Scanner(System.in);
        deck.cueAudio("proceed");

        int y = 0;
        while (y<1){

            String cardName = selectCard(deck);

            if (cardName.equals("BACK")){
                deck.cueAudio("back");
                y = y+1;
            }
            else {
                String model = selectModel(deck);
                if (model.equals("Back")){
                    deck.cueAudio("back");
                    y = y+1;
                }
                else {
                    var newCard = new ClassicCardClass(cardName, model);
                    deck.add(newCard);
                }
            }
        }
    }

    public static void remove(DeckClass deck){
        var input = new Scanner(System.in);
        deck.cueAudio("proceed");

        int x = 0;
        while (x<1){
            String cardName = selectCard(deck);
            if (cardName.equals("BACK")){
                deck.cueAudio("back");
                x = x +1;
            }
            else {
                deck.remove(cardName);
            }
        }
    }

    public static void view(DeckClass deck){
        var input = new Scanner(System.in);
        deck.cueAudio("proceed");

        int x = 0;
        System.out.println("Here are all your cards in your deck");

        while (x<1) {
            deck.viewCards();
            System.out.println("\n");
            System.out.println("View Commands:");
            System.out.println("▶ Get ---- You can view a specific card model ");
            System.out.println("▶ Change ---- This command offers model customization");
            System.out.println("▶ Back ---- Go back to main menu");

            String command = capitalize(input.nextLine());
            if (command.equals("Get")) {
                get(deck);
            } else if (command.equals("Change")) {
                change(deck);

            } else if (command.equals("Back")) {
                deck.cueAudio("back");
                x = x + 1;
            } else {
                deck.cueAudio("error");
                System.out.println("That's not a valid command, try again.");
            }
        }
    }

    public static void get(DeckClass deck) {
        String cardName = selectCard(deck);
        if (cardName.equals("BACK")){

        } else {
            deck.viewCardModel(cardName);
        }
    }

    public static void change(DeckClass deck){
        var input = new Scanner(System.in);
        deck.cueAudio("proceed");
        int x = 0;

        while (x < 1) {
            System.out.println("Do you want to change all the cards in your deck, or a specific card?");
            System.out.println("▶ Deck");
            System.out.println("▶ card");
            String command = capitalize(input.nextLine());
            if (capitalize(command ).equals("Deck")) {
                String model = selectModel(deck);
                if (model.equals("Back")) {
                    deck.cueAudio("back");
                    x++;
                } else {
                    deck.setCards(capitalize(model));
                }
                x++;

            } else if (capitalize(command ).equals("Card")) {
                String cardName = selectCard(deck);
                String model = selectModel(deck);
                if (model.equals("Back") || cardName.equals("BACK")) {
                    deck.cueAudio("back");
                    x++;
                }
                else {
                    deck.setCard(cardName, model);
                    x++;
                }
            }
            else {
                deck.cueAudio("error");
                System.out.println("That's not a valid command, try again.");
            }
        }
    }

    public static String selectModel(DeckClass deck){
        var input = new Scanner(System.in);
        deck.cueAudio("proceed");
        int x = 0;
        while (x<1){
            System.out.println("\s\s");
            System.out.println("What model do you want?");
            displayModelsAvailable();
            System.out.println("▶ Back ---- Head back to main menu");
            System.out.println("\s");
            String model = capitalize(input.nextLine().replaceAll("\\s", ""));
            System.out.println("\s");
            if (model.equals("Back")){
                deck.cueAudio("back");
                return model;
            }
            try {
                deck.modelChecker(model);
                return model;
            } catch (NotValidModelException e) {
                deck.cueAudio("error");
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    public static String selectCard(DeckClass deck){
        var input = new Scanner(System.in);
        deck.cueAudio("proceed");
        int x = 0;
        while (x<1){
            System.out.println("\s\s");
            System.out.println("What type of card would you like to add? Type the card's name like the  given examples below:");
            System.out.println("Example: 5C = 5 of Clubs || qs == Queen of Spades");
            System.out.println("\s");
            System.out.println("▶ Back ---- Head back to main menu");
            String cardName = (input.nextLine().replaceAll("\\s", "")).toUpperCase();

            if (cardName.equals("BACK")){
                deck.cueAudio("back");
                return cardName;
            }
            try {
                String rank = deck.rankChecker(cardName);
                String suit = deck.suitChecker(cardName);
                return cardName = rank+suit;
            } catch ( NotValidSuitException | NotValidRankException e) {
                deck.cueAudio("error");
                System.out.println(e.getMessage());
            }
        }
        return null;
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
}
