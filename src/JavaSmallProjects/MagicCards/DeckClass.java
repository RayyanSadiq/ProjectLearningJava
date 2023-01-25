package JavaSmallProjects.MagicCards;

import java.util.Random;

public class DeckClass {

    private String [] suits;

    private String [] ranks;

    private int maxCards;

    private CardClass[] cards;

    public DeckClass(String deckModel){
        suits = new String[]{"C","H","S","D"};
        ranks = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        maxCards = suits.length * ranks.length;
        newDeck(deckModel);
    }
    public void newDeck(String deckModel) {

        if (deckModel.equals("None")) {
            this.cards = new CardClass[maxCards];
        } else {
            this.cards = new CardClass[maxCards];
            int count = 0;
            for (int x = 0; x < suits.length; x++) {
                for (int y = 0; y < ranks.length; y++) {
                    this.cards[count] = new CardClass(ranks[y] + suits[x], deckModel);
                    count++;
                }
            }
        }
    }


    public void shuffle(){

        boolean isEmpty = true;

        Random randomGenerator = new Random();
        for (int i = 0; i < maxCards; i++) {
            if (cards[i] != null){


                int randomIndex = randomGenerator.nextInt(i+1);
                isEmpty = false;

                // Swap arr[i] with the element at random index
                CardClass temp = cards[i];
                cards[i] = cards[randomIndex];
                cards[randomIndex] = temp;
            }
            // Pick a random index from 0 to i

        }
        if (isEmpty){
            System.out.println("There are no cards to shuffle");
        } else {
            System.out.println("your deck has been successfully shuffled");
        }

    }

    public void sortCards() {
        CardClass[][] cardOrganizer = new CardClass[suits.length][ranks.length];

        int CCount = 0;
        int HCount = 0;
        int SCount = 0;
        int DCount = 0;

        boolean isEmpty = true;

        for (int y = 0; y < cards.length; y++) {
            if (cards[y] != null){
                isEmpty = false;
                if (cards[y].getName().contains("C")){
                    cardOrganizer[0][CCount] = cards[y];
                    CCount++;
                }
                if (cards[y].getName().contains("H")){
                    cardOrganizer[1][HCount] = cards[y];
                    HCount++;
                }
                if (cards[y].getName().contains("S")){
                    cardOrganizer[2][SCount] = cards[y];
                    SCount++;
                }
                if (cards[y].getName().contains("D")){
                    cardOrganizer[3][DCount] = cards[y];
                    DCount++;
                }
            }
        }
        if (isEmpty){
            System.out.println("There are no cards to sort");
        }
        else {

            for (int y = 0; y < cardOrganizer.length; y++){
                BubbleSort.sort(cardOrganizer[y]);
            }

            int count = 0;
            for (int x = 0; x < cardOrganizer.length; x++){
                for (int y = 0; y < cardOrganizer[x].length; y++){
                    cards[count] = cardOrganizer[x][y];
                    count++;
                }
            }
            System.out.println("Deck has been successfully sorted");
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
                    System.out.print(CardLibary.formatTextToEmoji(this.cards[count].getName()) + " ");
                }
                count++;
            }
        }
    }

    public void viewCardModel(String input) {
        String cardName = (input.replaceAll("\\s", "")).toUpperCase();
        String suit ="";
        boolean isRealCard = false;
        if (cardName.contains("C")||cardName.toUpperCase().contains("CLUBS")){
            suit ="C";
        } else if (cardName.contains("H")||cardName.toUpperCase().contains("HEARTS")) {
            suit ="H";
        } else if (cardName.contains("S")||cardName.toUpperCase().contains("SPADES")) {
            suit ="S";
        } else if (cardName.contains("D")||cardName.toUpperCase().contains("DIAMOND")) {
            suit ="D";
        }

        for(int i = 0; i < cards.length; i++ ){
            if (cards[i] != null) {
                if (cards[i].getName().equals(cardName.substring(0,1)+suit)){
                    isRealCard = true;
                    cards[i].getCardModel();
                }
            }
        }
        if (!isRealCard){
            System.out.println("There is no card like that in your deck");
        }
    }

}
