package OOP.Inheritance_And_Polymorphism;

public class The_Object_Class {
    public static void main(String[] args) {

        var obj = new Object(); // java has an in built class called "Object", this class is automatically inherited by
        // every class in Java.

        obj.getClass(); // gets all the methods and fields defined in an object
        obj.equals(obj); // this compares if two objects are the same, so we would use this to compare two strings
        obj.hashCode(); // returns an integer base don the address of this object in memory
        obj.toString(); // returns the string representation of an object
    }
}
