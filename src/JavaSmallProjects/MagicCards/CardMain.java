package JavaSmallProjects.MagicCards;


import java.util.Scanner;

public class CardMain {
    public static void main(String[] args) {
        System.out.println("♣❤welcome to MagicalCards♠♦");
        var input = new Scanner(System.in);
        int x = 0;
        var deck = new DeckClass("None");
        while (x<1){
            System.out.println("\n");
            System.out.println("Type any of the commands below: ");
            System.out.println("▶ Create ---- This command creates a new deck🗂️");
            System.out.println("▶ Shuffle ---- This command randomly shuffles the cards in your deck🔀");
            System.out.println("▶ Edit ---- This command will allow to remove or add cards to your current deck");
            System.out.println("▶ Sort ---- This command sorts your deck in order♻");
            System.out.println("▶ View ---- This allows you to view your current deck🃏");
            System.out.println("▶ Settings ---- Software settings⚙"); // toggle icons, auto sort, toggle sound
            System.out.println("\n");
            CardLibary.processInput(CardLibary.capitalize(input.nextLine()), deck);



        }
    }
}
