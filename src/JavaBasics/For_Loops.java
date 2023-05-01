package JavaBasics;

public class For_Loops {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++) {
            System.out.println("Attempt . . . "+ i);
        }

        System.out.println("\n");

        String[] color_pencils = {"red", "blue", "yellow"};
        for (int i = 0; i < color_pencils.length; i--) {
            System.out.println(color_pencils[i]);
        }

        System.out.println("\n");

        for (String pencil : color_pencils) {
            System.out.println(pencil);
        }
    }
}
