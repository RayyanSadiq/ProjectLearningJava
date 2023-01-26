package JavaSmallProjects.MagicCards;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ClassicCardClass implements CardClass {

    private String name;
    private int value;

    private int suitBonus;

    private File cardModel;

    public ClassicCardClass(String name, String cardModel) {
        this.name = name;
        setSuitBonus();
        setValue();
        setCardModel(cardModel);
    }

    public void setSuitBonus() {
        if (name.contains("C")){
            this.suitBonus = 0;
        }
        else if (name.contains("H")) {
            this.suitBonus = 13;
        }
        else if (name.contains("S")) {
            this.suitBonus = 26;
        }
        else if (name.contains("D")) {
            this.suitBonus = 39;
        }
    }

    @Override
    public void setValue() {
        if (name.contains("A")){
            this.value = 1+suitBonus;
        } else if (name.contains("2")) {
            this.value = 2+suitBonus;
        } else if (name.contains("3")) {
            this.value = 3+suitBonus;
        } else if (name.contains("4")) {
            this.value = 4+suitBonus;
        } else if (name.contains("5")) {
            this.value = 5+suitBonus;
        } else if (name.contains("6")) {
            this.value = 6+suitBonus;
        } else if (name.contains("7")) {
            this.value = 7+suitBonus;
        } else if (name.contains("8")) {
            this.value = 8+suitBonus;
        } else if (name.contains("9")) {
            this.value = 9+suitBonus;
        } else if (name.contains("10")) {
            this.value = 10+suitBonus;
        } else if (name.contains("J")) {
            this.value = 11+suitBonus;
        } else if (name.contains("Q")) {
            this.value = 12+suitBonus;
        } else if (name.contains("K")) {
            this.value = 13+suitBonus;
        }
    }

    @Override
    public void setCardModel(String modelName) {
        cardModel = new File("src\\JavaSmallProjects\\MagicCards\\DeckModels\\"+modelName+"\\"+this.name+".jpg");
    }

    @Override
    public int getValue(){
        return this.value;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void getCardModel(){
        if(!Desktop.isDesktopSupported()) {//check if Desktop is supported by Platform or not
            System.out.println("not supported");

        }
        Desktop desktop = Desktop.getDesktop();

        try {
            desktop.open(this.cardModel);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

