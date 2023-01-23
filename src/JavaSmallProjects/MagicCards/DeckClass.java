package JavaSmallProjects.MagicCards;

public class DeckClass {

    private CardClass[] cards;

    public DeckClass(String deckModel){
        if (deckModel.equals("None")){
            this.cards = new CardClass[0];
        }
        else {
            String [] suits = {"♣","❤","♠","♦"};
            String [] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
            this.cards = new CardClass[suits.length* ranks.length];
            int count = 0;
            for (int x = 0; x< suits.length; x++) {
                for (int y = 0; y < ranks.length; y++) {
                    this.cards[count] = new CardClass(ranks[y]+suits[x],deckModel);
                    count++;
                }
            }
            System.out.println(this.cards[0].getName());
            this.cards[0].getCardModel();
        }
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


}
