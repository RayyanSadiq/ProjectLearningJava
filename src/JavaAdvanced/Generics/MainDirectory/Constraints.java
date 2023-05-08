package JavaAdvanced.Generics.MainDirectory;

public class Constraints<T extends Number> { // Here we are adding something called constraints. These constraints
    // make it so that the data type we pass on to the argument can only be itself or its descendants which are number based data types
    // We would use constraints only when the methods and processes in here would only make sense to use on a set of data types.
    // We can also extend to something very specific like Integers, but that would defeat the purpose of making the whole thing
    // Generic, since generic classes are to avoid duplicating code in case we want a program to work for multiple data
    // types. If you want it to work for one data types, then making the class generic or method generic would defeat the purpose of it.

    public T doubleNumber(T number) {
        T a = (T) Integer.valueOf(number.intValue() * 2); // Over here is an operation that makes sense only in the context of
        return a; // of numbers, if we remove the constraint or replace the constraint to any thing besides Numbers or its
        // descendants we would get an error.
    }
}
