package JavaBasics;

public class If_Statements {
    public static void main(String[] args) {
        int temp = 34;

        if (temp >= 30) {
            System.out.println("it's hot. . .panting noises");
        } else if (temp > 10 && temp < 30) {
            System.out.println("Brr. . . its cold");
        } else {
            System.out.println(" its global freezing time");
        }

        // Simplifying if statements:

        Byte Hp = 12;
        boolean is_Full_Health = (Hp == 100); // Here we can assign boolean expressions to a boolean variable in its
        // declaration making it much cleaner and easier to read.
        System.out.println(is_Full_Health);

    }
}
