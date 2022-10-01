package JavaBasics;

public class Switch_Statements {
    public static void main(String[] args) {

        Byte monster_role = 6;

        switch (monster_role) {
            case 1:
                System.out.println("Jagras");
                break;
            case 2:
                System.out.println("Jagras");
                break;
            case 3:
                System.out.println("Anjanath");
                break;
            case 4:
                System.out.println("Rathalos");
                break;
            case 5:
                System.out.println("Leshen");
                break;
            default:
                System.out.println("Welcome to monster ecological food chain dictionary, type in a number from 1 - 5");

        }
    }
}
