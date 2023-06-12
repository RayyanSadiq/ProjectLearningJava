package JavaAdvanced.LambdaExpressions.TheProblemAndOldSolution;

public class AnonymousInnerClass {

    public static String suffix = ":";

    public String suffix2 = "-=";

    public static void show1(){
        greet(message -> {
            System.out.println(message);
        });

    }

    public static void greet(Printer printer){
        printer.print("hello");
    }
}
