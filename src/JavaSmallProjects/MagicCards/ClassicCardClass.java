package JavaSmallProjects.MagicCards;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ClassicCardClass implements CardClass {

    private String name;

    private int value;

    private int suitBonus;

    private File cardModel;

    public ClassicCardClass(String name, String cardModel) {
        this.name = name;
        setValue();
        setCardModel(cardModel);
    }

    private void setValue() {


        Map<String, Integer> rankMap = new HashMap<>();
        rankMap.put("A",1);
        rankMap.put("2",2);
        rankMap.put("3",3);
        rankMap.put("4",4);
        rankMap.put("5",5);
        rankMap.put("6",6);
        rankMap.put("7",7);
        rankMap.put("8",8);
        rankMap.put("9",9);
        rankMap.put("J",11);
        rankMap.put("Q",12);
        rankMap.put("K",13);

        Map<String, Integer> suitMap = new HashMap<>();
        suitMap.put("C",0);
        suitMap.put("H",13);
        suitMap.put("S",26);
        suitMap.put("D",39);

        if (name.contains("10")){

            this.value = 10 + suitMap.get(name.substring(2,3));
        } else {
            this.value = rankMap.get(name.substring(0,1)) + suitMap.get(name.substring(1,2));
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

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof ClassicCardClass that)){
            return false;
        }
        return this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

