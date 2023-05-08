package JavaAdvanced.Generics.MainDirectory;

public class GenericsMain {
    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(23);  // The Generic class ensures that every object in this list is an integer
        int num = list.get(0); // we also don't have to explicitly cast anymore, and all errors will be caught by the compiler
        // at compile time.

        var genericNumbers = new Constraints<Double>(); // Here is our Generic Class with constraints. We cannot pass values
        // that are non-numerical.
        System.out.println(genericNumbers.doubleNumber(3.3)); // Any Number value will work here.

        var genericPair = new KeyValuePairClass<String,Integer>("string",2); // Here is an example of a Generic class
        // with two generic type parameters.
        genericPair.printPairValues();

    }
}
