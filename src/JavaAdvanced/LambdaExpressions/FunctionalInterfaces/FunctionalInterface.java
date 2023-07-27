package JavaAdvanced.LambdaExpressions.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {

        Function<String,String> removeColon = str -> str.replace(":","="); // functional interfaces take in
        // one argument and then return a value. The first generic parameter we specify the data type accepted and in the,
        // second generic data type we specify the return value.

        Function<String,String> addCurlyBraces = str -> "{"+str+"}";

        var result = removeColon
                .andThen(addCurlyBraces)
                .apply("kk:s");

        // We use the apply keyword to apply a function
        // operation on an input. We can also chain function calls.

        // This approach is also declarative programming where we focus on "what" should be done instead of how it
        // should be done. As you can see in this paradigm we build small function that are reusable and build up into
        // something complex. When chaining function calls, its a good practice to separate each one like we did above.

        var result2 = removeColon.compose(addCurlyBraces).apply("fff:ss");
        // compose does the same thing as "andThen"

        System.out.println(result);
        System.out.println(result2);
    }
}
