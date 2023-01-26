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
        this.cards = new CardClass[maxCards];
    }

    public CardClass[] getCards() {
        return cards;
    }

    public String[] getSuits() {
        return suits;
    }

    public String[] getRanks() {
        return ranks;
    }

    public int getMaxCards() {
        return maxCards;
    }

    public void setDeck(CardClass [] cards) {
        this.cards = cards;
    }

    public void setCards(String deckModel){

        for (int i = 0; i < maxCards; i++){
            if (cards[i] != null){
                cards[i].setCardModel(deckModel);
            }
        }
    }

    public void setCard(String name, String model){
        String cardName = (name.replaceAll("\\s", "")).toUpperCase();
        String suit = suitChecker(cardName);
        String rank = rankChecker(cardName);
        boolean isRealCard = false;

        for (int i = 0; i < maxCards; i++){
            if (cards[i] != null){
                if (cards[i].getName().equals(rank+suit)){
                    isRealCard = true;
                    cards[i].setCardModel(model);
                }
            }
        }
        if (!isRealCard){
            System.out.println("There is no card like that in your deck");
        }
    }

    public void shuffle(){

        boolean isEmpty = true;
        for (int i = 0; i < maxCards; i++){
            if (cards[i] != null){
                isEmpty = false;
                break;
            }
        }

        Random randomGenerator = new Random();
        for (int i = 0; i < maxCards; i++) {

                int randomIndex = randomGenerator.nextInt(i+1);
                isEmpty = false;

                // Swap arr[i] with the element at random index
                CardClass temp = cards[i];
                cards[i] = cards[randomIndex];
                cards[randomIndex] = temp;

            // Pick a random index from 0 to i
        }
        if (isEmpty){
            System.out.println("There are no cards to shuffle");
        } else {
            System.out.println("your deck has been successfully shuffled");
        }
    }

    public void sortCards() {
        CardClass[] cardArray;
        CardClass[] nullArray;

        int cardAmount = 0;
        int nullAmount = 0;
        boolean isEmpty = true;

        for (int y = 0; y < cards.length; y++) {
            if (cards[y] != null){
                isEmpty = false;
                cardAmount++;
            }
            else {
                nullAmount++;
            }
        }

        cardArray = new CardClass[cardAmount];
        nullArray = new CardClass[nullAmount];

        int cardCount = 0;
        int nullCount = 0;

        for (int y = 0; y < cards.length; y++) {
            if (cards[y] != null){
                 cardArray[cardCount] = cards[y];
                 cardCount++;
            }
            else {
                nullArray[nullCount] = cards[y];
                nullCount++;
            }
        }

        if (isEmpty){
            System.out.println("There are no cards to sort");
        }
        else {

            BubbleSort.sort(cardArray);

            int count = 0;
            for (int x = 0; x < cardArray.length; x++){
                cards[count] = cardArray[x];
                count++;
            }
            for (int x = 0; x < nullArray.length; x++){
                cards[count] = nullArray[x];
                count++;
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
        String suit = suitChecker(cardName);
        String rank = rankChecker(cardName);
        boolean isRealCard = false;


        for(int i = 0; i < cards.length; i++ ){
            if (cards[i] != null) {
                if (cards[i].getName().equals(rank+suit)){
                    isRealCard = true;
                    cards[i].getCardModel();
                }
            }
        }
        if (!isRealCard){
            System.out.println("There is no card like that in your deck");
        }
    }

    public void remove (String input) {
        String cardName = (input.replaceAll("\\s", "")).toUpperCase();
        String suit = suitChecker(cardName);
        String rank = rankChecker(cardName);
        boolean isRealCard = false;


        for(int i = 0; i < cards.length; i++ ){
            if (cards[i] != null) {
                if (cards[i].getName().equals(rank+suit)){
                    isRealCard = true;
                    cards[i] = null;
                }
            }
        }
        if (!isRealCard){
            System.out.println("There is no card like that in your deck");
        } else{
            System.out.println("Card has successfully been removed!");
        }
    }

    public void add(CardClass newCard) {
        for(int i = 0; i < cards.length; i++ ){
            if (cards[i] == null) {
                 cards[i]= newCard;
                 break;
            }
        }
    }

    public String suitChecker(String str){
        if (str.contains("C")||str.contains("CLUBS")){
            return "C";
        } else if (str.contains("H")||str.contains("HEARTS")) {
            return "H";
        } else if (str.contains("S")||str.contains("SPADES")) {
            return "S";
        } else if (str.contains("D")||str.contains("DIAMOND")) {
            return "D";
        }
        return "";
    }

    public String rankChecker(String str){
        if (str.contains("A")||str.contains("ACE")){
            return "A";
        } else if (str.contains("2")||str.contains("TWO")) {
            return "2";
        } else if (str.contains("3")||str.contains("THREE")) {
            return "3";
        } else if (str.contains("4")||str.contains("FOUR")) {
            return "4";
        }else if (str.contains("5")||str.contains("FIVE")) {
            return "5";
        } else if (str.contains("6")||str.contains("SIX")) {
            return "6";
        } else if (str.contains("7")||str.contains("SEVEN")) {
            return "7";
        } else if (str.contains("8")||str.contains("EIGHT")) {
            return "8";
        } else if (str.contains("9")||str.contains("NINE")) {
            return "9";
        } else if (str.contains("10")||str.contains("TEN")) {
            return "10";
        }else if (str.contains("J")||str.contains("JOKER")) {
            return "J";
        } else if (str.contains("Q")||str.contains("QUEEN")) {
            return "Q";
        } else if (str.contains("K")||str.contains("KING")) {
            return "K";
        }
        return "";
    }

}
