package JavaSmallProjects.MagicCards;

import java.util.Arrays;

public class DeckClass {

    private String [] suits;

    private String [] ranks;

    private int maxCards;

    private CardClass[] cards;

    public DeckClass(String deckModel){
        suits = new String[]{"♣","❤","♠","♦"};
        ranks = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        maxCards = suits.length * ranks.length;
        newDeck(deckModel);
    }

    public void setCards(String deckModel){

        if (cards[0]== null){
            System.out.println("There are no cards in the deck to set");
        }
        else {
            for (CardClass card : this.cards) {
                card.setCardModel(deckModel);
            }
        }
    }
    public void viewCards() {
        int count = 0;

        for (int x = 0; x < suits.length;x++) {
            System.out.println();
            for (int y = 0; y < ranks.length; y++ ){
                if (this.cards[count]== null){
                    System.out.print(" N/A ");
                }
                else {
                    System.out.print(this.cards[count].getName());
                }
                count++;
            }
        }
    }

    public void viewCardModel(String input) {
        String cardName = (input.replaceAll("\\s", "")).toUpperCase();
        String suit ="";
        if (cardName.contains("C")||cardName.toUpperCase().contains("CLUBS")){
            suit ="♣";
        } else if (cardName.contains("H")||cardName.toUpperCase().contains("HEARTS")) {
            suit ="❤";
        } else if (cardName.contains("S")||cardName.toUpperCase().contains("SPADES")) {
            suit ="♠";
            System.out.println("he");
        } else if (cardName.contains("D")||cardName.toUpperCase().contains("DIAMOND")) {
            suit ="♦";
        }

        for(int i = 0; i < cards.length; i++ ){
            if (cards[i].getName().equals(cardName.substring(0,1)+suit)){
                cards[i].getCardModel();
            }
        }

    }

    public void newDeck(String deckModel) {

        if (deckModel.equals("None")){
            this.cards = new CardClass[maxCards];
        }
        else {
            this.cards = new CardClass[maxCards];
            int count = 0;
            for (int x = 0; x< suits.length; x++) {
                for (int y = 0; y < ranks.length; y++) {
                    this.cards[count] = new CardClass(ranks[y] + suits[x], deckModel);
                    count++;
                }
            }
            cards[27].getCardModel();
        }
    }
}
