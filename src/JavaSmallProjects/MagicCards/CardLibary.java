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
        deck.cueAudio("proceed");

        System.out.println("Which model do you want your new deck to be based on? Type one of the card themes below:");
        displayModelsAvailable();
        String deckModel = null;
        try {
            deckModel = deck.modelChecker(capitalize(input.nextLine()));
            int count = 0;
            ClassicCardClass [] cards = new ClassicCardClass[deck.getMaxCards()];
            for (int x = 0; x < deck.getSuits().length; x++) {
                for (int y = 0; y < deck.getRanks().length; y++) {
                    cards[count] = new ClassicCardClass(deck.getRanks()[y] + deck.getSuits()[x], deckModel);
                    count++;
                }
            }
            deck.setDeck(cards);

        } catch (NotValidModelException e) {
            deck.cueAudio("error");
            System.out.println(e.getMessage());
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
                add(deck);
                x =+ 1;
            }
            else if (command.equals("Remove")) {
                remove(deck);
                x =+ 1;
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
    public static void add(DeckClass deck){
        var input = new Scanner(System.in);
        deck.cueAudio("proceed");

        System.out.println("What model do you want?");
        displayModelsAvailable();
        String model = capitalize(input.nextLine().replaceAll("\\s", ""));
        deck.cueAudio("proceed");

        try {
            System.out.println("▶ What type of card would you like to add? Type the card's name like the  given examples below:");
            System.out.println("Example: 5C = 5 of Clubs || qs == Queen of Spades");
            String cardName = (input.nextLine().replaceAll("\\s", "")).toUpperCase();
            String rank = deck.rankChecker(cardName);
            String suit = deck.suitChecker(cardName);
            System.out.println(rank+suit);
            var newCard = new ClassicCardClass(rank+suit, deck.modelChecker(model));
            deck.add(newCard);

        } catch (NotValidRankException | NotValidSuitException | NotValidModelException e) {
            deck.cueAudio("error");
            System.out.println(e.getMessage());
        }



    }

    public static void remove(DeckClass deck){
        var input = new Scanner(System.in);
        deck.cueAudio("proceed");
        System.out.println("▶ which card do you want to remove? Type the card's name like the given examples below:");
        System.out.println("Example: Jd = Joker of Diamonds || Ks == King of Spades");
        try {
            deck.remove(input.nextLine());

        } catch (NotValidRankException | NotValidSuitException e) {
            deck.cueAudio("error");
            System.out.println(e.getMessage());
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
        deck.cueAudio("proceed");
        var input = new Scanner(System.in);
        System.out.println("\s");
        System.out.println("You can check a specific card's model by typing the rank of the card, and then the suit ");
        System.out.println("Example: 2s = 2 of spades || As == Ace of spades");
        System.out.println("\s");

        try {
            deck.viewCardModel(input.nextLine());
        } catch (NotValidRankException | NotValidSuitException e) {
            deck.cueAudio("error");
            System.out.println(e.getMessage());
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
                deck.cueAudio("proceed");
                System.out.println("Which model do you want to set all your cards to?");
                displayModelsAvailable();
                try {
                    deck.setCards(capitalize(input.nextLine()));
                } catch (NotValidModelException e) {
                    deck.cueAudio("error");
                    e.getMessage();
                }
                x = +1;
            } else if (capitalize(command ).equals("Card")) {
                deck.cueAudio("proceed");
                System.out.println("Type the name of the card that you want to change?");
                System.out.println("Example: Ks = King of spades || 10d == 10 of diamond");
                String cardName = input.nextLine();
                deck.cueAudio("proceed");
                System.out.println("Which model do you want to set this card to?");
                displayModelsAvailable();
                try {
                    deck.setCard(cardName, capitalize(input.nextLine()));
                } catch (NotValidRankException | NotValidModelException | NotValidSuitException e) {
                    deck.cueAudio("error");
                    System.out.println(e.getMessage());
                }
                x = +1;
            }
            else {
                deck.cueAudio("error");
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


}
