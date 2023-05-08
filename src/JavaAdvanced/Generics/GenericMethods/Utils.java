package JavaAdvanced.Generics.GenericMethods;

import JavaAdvanced.Generics.MainDirectory.GenericList;
import JavaAdvanced.Generics.TheComparableInterface.User;

public class Utils {

    public static <T extends Comparable<T>> T max (T number1, T number2) { // here we have a library with methods being
        //specifically generic without the need of the class to be generic which is very useful.
        // add the generic type parameters and replace all data types with T. The return type does not HAVE to be T.
        return (number1.compareTo(number2) < 0) ? number2:number1; // here we use the compare to method which takes in
        // the first number and compares it to the second number by subtracting them( number1 - number2), then returns
        // a value based on the values of the number. As we covered it returns a negative if the first value is smaller than the
        // value it is being compared to, or it returns 0, if the values are the same, or it returns a positive, if the
        // first value is bigger then the value it is being compared to.

        // KEEP IN MIND THAT GENERIC METHOD WORK EXACTLY LIKE GENERIC CLASSES, WILDCARDS ARE NOT RELATED TO GENERIC METHODS
        // AT ALL EXCEPT THAT THE DATA TYPE OF THE PARAMETER ITSELF IS A GENERIC TYPE. DO NOT CONFUSE.

    }

    public static <K, V> void print (K key ,V values) { // multiple parameters for methods in classes
        System.out.println(key + "=" + values);

    }


}
