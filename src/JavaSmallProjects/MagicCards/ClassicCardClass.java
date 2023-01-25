package JavaSmallProjects.MagicCards;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ClassicCardClass implements CardClass {

    private String name;
    private int value;
    private File cardModel;


    public ClassicCardClass(String name, String cardModel) {
        this.name = name;
        setValue();
        setCardModel(cardModel);
    }

    @Override
    public void setValue() {
        if (name.contains("A")){
            this.value = 1;
        } else if (name.contains("2")) {
            this.value = 2;
        } else if (name.contains("3")) {
            this.value = 3;
        } else if (name.contains("4")) {
            this.value = 4;
        } else if (name.contains("5")) {
            this.value = 5;
        } else if (name.contains("6")) {
            this.value = 6;
        } else if (name.contains("7")) {
            this.value = 7;
        } else if (name.contains("8")) {
            this.value = 8;
        } else if (name.contains("9")) {
            this.value = 9;
        } else if (name.contains("10")) {
            this.value = 10;
        } else if (name.contains("J")) {
            this.value = 11;
        } else if (name.contains("Q")) {
            this.value = 12;
        } else if (name.contains("K")) {
            this.value = 13;
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

