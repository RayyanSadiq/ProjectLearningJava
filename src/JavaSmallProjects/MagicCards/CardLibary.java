package JavaSmallProjects.MagicCards;

import java.io.File;
import java.util.Scanner;

public class CardLibary {

    public static void processInput(String command, DeckClass deck) {
        var input = new Scanner(System.in);

        if (command.equals("create")) {
            System.out.println("which model do you want your new deck to be based on? Type one of the card themes below");
            displayModels();

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

            System.out.println("Deck successfully created");
        }


        else if (command.equals("shuffle")) {
            deck.shuffle();
        } else if (command.equals("edit")) {

            int x = 0;
            while (x<1){
                System.out.println("Here are your edit commands:");
                System.out.println("▶ remove ---- This command will ask the card you want to remove");
                System.out.println("▶ add ---- This command will ask what type of card to add to your deck");
                String command4 = input.nextLine();
                if (command4.equals("remove")){
                    System.out.println("▶ which card remove?");
                    deck.remove(input.nextLine());
                    x =+ 1;
                } else if (command4.equals("add")) {
                    int nullCount = 0;
                    for (int i = 0; i<deck.getMaxCards();i++){
                        if (deck.getCards()[i] == null){
                            nullCount++;
                        }
                    }

                    if (nullCount>0){
                        System.out.println("▶ which card add?");
                        String cardName = (input.nextLine().replaceAll("\\s", "")).toUpperCase();
                        String suit = deck.suitChecker(cardName);
                        String rank = deck.rankChecker(cardName);
                        System.out.println("what model do u want");
                        var newCard = new  ClassicCardClass(rank+suit, capitalize(input.nextLine()));
                        deck.add(newCard);
                        x =+ 1;
                    } else {
                        System.out.println("no space");
                        x =+ 1;
                    }

                }
            }

        } else if (command.equals("sort")) {
            deck.sortCards();
        }
        else if (command.equals("view")) {
            int x = 0;
            System.out.println("here are all your cards in your deck");
            while (x<1){
                deck.viewCards();
                System.out.println("\s");
                System.out.println("View Commands:");
                System.out.println("▶ get ---- you can view a specific card model ");
                System.out.println("▶ Change ---- This command offers model customization");
                System.out.println("▶ back ----Go back to main menu");

                String command2 = input.nextLine();
                if (command2.equals("get")){
                    System.out.println("\s");
                    System.out.println("you can check a specific card's model by typing the rank of the card, and then the suit ");
                    System.out.println("Example: 2s = 2 of spades || A of spades == Ace of spades");
                    System.out.println("\s");
                    deck.viewCardModel(input.nextLine());
                }
                else if (command2.equals("Change")) {
                    int y = 0;
                    while (y<1){
                        System.out.println("Do you want to change all the cards in your deck, or a specific card?");
                        System.out.println("▶ Deck");
                        System.out.println("▶ card");
                        String command3 = input.nextLine();
                        if (capitalize(command3).equals("Deck")){
                            System.out.println("Which model do you want to set all your cards to?");
                            displayModels();
                            deck.setCards(capitalize(input.nextLine()));
                            y =+1;
                        }
                        else if (capitalize(command3).equals("Card")) {
                            System.out.println("Type the name of the card that you want to change?");
                            System.out.println("Example: Ks = King of spades || 10d == 10 of diamond");
                            String cardName = input.nextLine();
                            System.out.println("Which model do you want to set this card to");
                            displayModels();
                            deck.setCard(cardName, capitalize(input.nextLine()));
                            y =+1;
                        }
                    }

                }
                else if (command2.equals("back")) {
                    x = x+1;
                }
            }
        }
    }

    public static void displayModels(){
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
        str  = str.replaceAll("\\s", "");
        if (str == null || str.isEmpty()){
            return str;
        }
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
