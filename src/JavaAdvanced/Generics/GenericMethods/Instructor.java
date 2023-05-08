package JavaAdvanced.Generics.GenericMethods;

import JavaAdvanced.Generics.TheComparableInterface.User;

public class Instructor extends User {

    public Instructor(int points) {
        super(points);
    }

    public static <T> T max (T number1){

        return number1;
    }



}
