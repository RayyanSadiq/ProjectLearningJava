package JavaBasics;

public class Creating_methods {
    public static void main(String[] args) {
        greet1("dragon","boy");
        String greetings = greet2("dragon", "man");
        System.out.println(greetings);
    }

    public static void greet1(String firstName, String lastName) { // each method has a signature, a signature is a
        // method's number of, type of, and order of parameters. Changing single one of these, changes the parameters.
        System.out.println("Greetings " + firstName + " " + lastName);
    }

    public static String greet2(String firstName, String lastName) {
        return ("Greetings " + firstName + " " + lastName);
    }
}
