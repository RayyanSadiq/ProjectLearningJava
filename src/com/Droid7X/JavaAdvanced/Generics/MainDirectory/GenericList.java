package com.Droid7X.JavaAdvanced.Generics.MainDirectory;

public class GenericList <T> { // so we make our class generic by adding the angled bracket "<>" and then inserting a
    // parameter in there as well, which could be any letter, but T is a common convention. Another common convention is "E".
    // When we instantiate this class, we have to specify a value for this parameter. "T" will be whatever data type is
    // passed on.

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
