package JavaAdvanced.Generics;

public class GenericList <T /*extends Number*/> { // so we make our class generic by adding the angled bracket "<>" and then inserting a
    // parameter in there as well, which could be any letter, but T is a common convention. Another convention is "E".
    // When we initialize this class, we have to specify a value for this parameter. "T" will be whatever data type is
    // passed on. we also have something called constraints where T is extended to the number class, which means
    // the argument we pass on to the parameters can only be its subclasses or descendants which are number based data types
    // We would use constraints only when the methods and processes in here would only make sense to use on a set of data types.
    // We can also put something very specific like Integers, but that would defeat the purpose of making the whole thing
    // Generic, since generic classes are to avoid duplicating code in case we want a program to work for multiple data
    // types.

    private T[] items =  (T []) new Object[10]; // here we are making a array based on whatever "T" is, however we cannot
    // instantiate directly since the java compiler does not know what T is, so what we can do is create an object array
    // and then cast it to the "T" data type, since all reference types have a common parent "Object", and T will always
    // be a reference type.

    private int count;

    public void add (T item) {
        items[count++ ] = item;
    }

    public T get (int index) {
        return items[index];
    }

}
