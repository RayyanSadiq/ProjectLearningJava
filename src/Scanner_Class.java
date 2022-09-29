import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        System.out.print("age: ");
        Scanner input = new Scanner(System.in); // prints in
        int age = input.nextInt();
        System.out.println("you are " + age); // Here we have something called concatenation which is to add a string
        // with another string or value which turned into a string via casting.

        System.out.print("Name: " + input.next());
        String name1 = input.nextLine(); // input.next won;t print out the spaces or words after the first word
        // We us input.nextLine to get every word in the variable
        System.out.println("you are " + name1); // Here we have something called concatenation which is to add a string
        // with another string or value which turned into a string via casting.

        System.out.print("Name: " + input.nextLine());
        String name2 = input.nextLine();
        System.out.println("you are " + name2);


    }
}
