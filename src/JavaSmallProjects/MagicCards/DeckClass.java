package JavaSmallProjects.MagicCards;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DeckClass {

    private String [] suits;

    private String [] ranks;

    private int maxCards;

    private boolean iconFormat;

    private boolean autoSort;

    private CardClass[] cards;

    private File deckModels;

    private AudioPlayer audio;

    public DeckClass(String deckModel, AudioPlayer audio){
        this.iconFormat = true;
        this.audio = audio;
        this.deckModels  = new File("src\\JavaSmallProjects\\MagicCards\\DeckModels");
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
    public boolean getAudioStatus() {
        return audio.getStatus();
    }
    public int getMaxCards() {
        return maxCards;
    }
    public boolean getIconFormat() {
        return iconFormat;
    }
    public boolean getAutoSort() {
        return autoSort;
    }
    public void setDeck(CardClass [] cards) {
        this.cards = cards;
    }

    public void setCards(String deckModel) {

        for (int i = 0; i < maxCards; i++){
            if (cards[i] != null){
                cards[i].setCardModel(deckModel);
            }
        }

        if (isEmpty()){
            cueAudio("error");
            System.out.println("They are no cards in your deck, try adding some.");
        } else {
            cueAudio("success");
            System.out.println("All cards in the deck have been successfully changed");
        }
    }

    public void setCard(String name, String model) {

        for (int i = 0; i < maxCards; i++){
            if (cards[i] != null){
                if (cards[i].getName().equals(name)){
                    cards[i].setCardModel(model);
                    break;
                }
            }
        }
        if (!isCard(name)){
            cueAudio("error");
            System.out.println("This card is not in your deck.");
        } else {
            cueAudio("success");
            System.out.println("Card model has been successfully set");
        }
    }

    public void shuffle(){

        Random randomGenerator = new Random();
        for (int i = 0; i < maxCards; i++) {

            int randomIndex = randomGenerator.nextInt(i+1);

            CardClass temp = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = temp;
        }
        if (isEmpty()){
            cueAudio("error");
            System.out.println("There are no cards to shuffle");
        }
        else {
            cueAudio("shuffle");
            System.out.println("your deck has been successfully shuffled");
        }
    }

    public void sortCards() {
        CardClass[] cardArray;
        CardClass[] nullArray;

        int cardAmount = 0;
        int nullAmount = 0;

        for (int y = 0; y < cards.length; y++) {
            if (cards[y] != null){
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
    }

    public void viewCards() {
        int count = 0;
        for (int x = 0; x < suits.length;x++) {
            System.out.println();
            for (int y = 0; y < ranks.length; y++ ){
                if (this.cards[count]== null){
                    System.out.print("N/A  ");
                }
                else if(iconFormat) {
                    System.out.print(CardLibary.formatTextToEmoji(this.cards[count].getName()) + "  ");
                } else {
                    System.out.print(this.cards[count].getName() + "  ");
                }
                count++;
            }
        }
    }

    public void viewCardModel(String cardName) {
        for(int i = 0; i < cards.length; i++ ){
            if (cards[i] != null) {
                if (cards[i].getName().equals(cardName)){
                    cards[i].getCardModel();
                    cueAudio("cardOpen");
                    break;
                }
            }
        }
        if (isCard(cardName)){
            System.out.println("Card has been successfully retrieved");
        } else {
            cueAudio("error");
            System.out.println("There is no card like that in your deck");
        }
    }

    public void remove (String cardName)  {
        boolean isCard = false;

        for(int i = 0; i < cards.length; i++ ){
            if (cards[i] != null) {
                if (cards[i].getName().equals(cardName)){
                    cards[i] = null;
                    isCard = true;
                    break;
                }
            }
        }
        if(isCard) {
            cueAudio("cardOpen");
            System.out.println("Card has successfully been removed!");
            if (autoSort){
                sortCards();
            }
        } else {
            cueAudio("error");
            System.out.println("There is no card like that in your deck");
        }
    }

    public void add(CardClass newCard) {
        int nullCount = 0;
        for (int i = 0; i<getMaxCards();i++){
            if (getCards()[i] == null){
                nullCount++;
            }
        }
        if (nullCount>0){
            for(int i = 0; i < cards.length; i++ ){
                if (cards[i] == null) {
                    cards[i]= newCard;
                    break;
                }
            }
            cueAudio("cardOpen");
            System.out.println("Card has been successfully added");
            if (autoSort){
                sortCards();
            }
        }
        else {
            cueAudio("error");
            System.out.println("There are no spaces left in your deck, try removing some cards to make some.");
        }
    }

    public void cueAudio (String str){
        try {
            audio.setFileName(str);
            audio.play();
        }
        catch (Exception e) {
            System.out.println("audio is unable to play");
        }
    }

    public void toggleAudio (){
        if (audio.getStatus()){
            audio.setStatus(false);
        } else {
            audio.setStatus(true);
        }
    }

    public void toggleIconFormat(){
        if (iconFormat){
            iconFormat = false;
        } else {
            iconFormat = true;
        }
    }

    public void toggleAutoSort(){
        if (autoSort){
            autoSort = false;
        } else {
            autoSort = true;
        }
    }

    public boolean isEmpty(){
        boolean isEmpty = true;
        for (int i = 0; i < maxCards; i++){
            if (cards[i] != null){
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    public boolean isCard(String name){
        boolean isCard = false;
        for (int i = 0; i < cards.length; i++ ){
            if (cards[i] != null) {
                if (cards[i].getName().equals(name)){
                    isCard = true;
                    break;
                }
            }
        }
        return isCard;
    }

    public String modelChecker(String deckModel) throws NotValidModelException {

        for (File model:deckModels.listFiles()){
            if (model.getName().equals(deckModel)){
                return deckModel;
            }
        }
        throw new NotValidModelException();
    }

    public String suitChecker(String str) throws NotValidSuitException {
        if (str.contains("C")) {return "C";}
        else if (str.contains("H")) {return "H";}
        else if (str.contains("S")) {return "S";}
        else if (str.contains("D")) {return "D";}
        else { throw new NotValidSuitException();}
    }

    public String rankChecker(String str) throws NotValidRankException {
        Map<String, String> rankMap = new HashMap<>();

        rankMap.put("A","A");
        rankMap.put("2","2");
        rankMap.put("3","3");
        rankMap.put("4","4");
        rankMap.put("5","5");
        rankMap.put("6","6");
        rankMap.put("7","7");
        rankMap.put("8","8");
        rankMap.put("9","9");
        rankMap.put("J","11");
        rankMap.put("Q","12");
        rankMap.put("K","13");

        if (str.contains("10")){
            return "10";
        } else if (rankMap.containsKey(str.substring(0,1))){
             return rankMap.get(str.substring(0,1));
        } else{
            throw new NotValidRankException();
        }


    }
}
