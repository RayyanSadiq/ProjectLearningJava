package JavaAdvanced.Generics;

public class GenericsMain {
    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(23);  // The Generic class ensures that every object in this list is an integer
        int num = list.get(0); // we also don't have to explicitly cast anymore, and all errors will be caught by the compiler
        // at compile time.



    }
}
