package JavaSmallProjects.MagicCards;

// show card picture
// show card different types of model

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CardClass {

    private String name;

    private File cardModel;


    public CardClass(String name,String cardModel) {
        this.name = name;
        setCardModel(cardModel);
    }

    public void setCardModel (String modelName) {
        cardModel = new File("src\\JavaSmallProjects\\MagicCards\\DeckModels\\"+modelName+"\\"+this.name+".jpg");
    }

    public String getName(){
        return name;
    }

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

