package JavaAdvanced.Exceptions.ThorwingExceptions;

public class Main {
    public static void main(String[] args) {
        try {
            Library.show1();
        } catch (Throwable ex) {
            System.out.println("something unexpected happened");
        }

        try {
            Library.show2();
        } catch (Throwable ex) {
            System.out.println("something unexpected happened");
        }
    }
}
