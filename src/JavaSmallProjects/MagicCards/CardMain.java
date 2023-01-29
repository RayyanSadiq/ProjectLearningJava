package JavaSmallProjects.MagicCards;


import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Scanner;

public class CardMain {
    public static void main(String[] args) {
        System.out.println("♣❤welcome to MagicalCards♠♦");
        var input = new Scanner(System.in);
        int x = 0;

        var audio = new SimpleAudioPlayer();
        var deck = new DeckClass("None", audio);

        while (x<1){
            System.out.println("\n");
            System.out.println("Type any of the commands below: ");
            System.out.println("▶ Create ---- This command creates a new deck🗂️");
            System.out.println("▶ Shuffle ---- This command randomly shuffles the cards in your deck🔀");
            System.out.println("▶ Edit ---- This command will allow to remove or add cards to your current deck");
            System.out.println("▶ Sort ---- This command sorts your deck in order♻");
            System.out.println("▶ View ---- This allows you to view your current deck🃏");
            System.out.println("▶ Settings ---- Software settings⚙");
            System.out.println("▶ End ---- Close software");
            System.out.println("\n");

            String command = CardLibary.capitalize(input.nextLine());
            if (command.equals("End")){
                x =+1;
            } else {
                CardLibary.processInput(command, deck);
            }
        }
    }
}
