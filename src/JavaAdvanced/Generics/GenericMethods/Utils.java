package JavaAdvanced.Generics.GenericMethods;

import JavaAdvanced.Generics.GenericList;
import JavaAdvanced.Generics.TheComparableInterface.User;

public class Utils {

    public static <T extends Comparable<T>> T max (T number1, T number2) { // here we have a library with methods being
        //specifically generic without the need of the class to be generic which is very useful.
        return (number1.compareTo(number2) < 0) ? number2:number1; // here we use the compare to method which takes in
        // the first number and compares it to the second number by subtracting them( number1 - number2), then returns
        // a value based on the values of the number. As we covered it returns a negative if the first value is smaller than the
        // value it is being compared to, or it returns 0, if the values are the same, or it returns a positive, if the
        // first value is bigger then the value it is being compared to.

    }

    public static <K, V> void print (K key ,V values) { // multiple parameters for methods in classes
        System.out.println(key + "=" + values);

    }

    public static void printUser(User user) {
        System.out.println(user);
    }


    // class CaptureClass#1 {}
    // class CaptureClass#1 {} extends User {}

    public static void printUsers(GenericList<? extends User> users) { // here we put "?" in the parameter of the GenericList, which
        // is the wildcard symbol. This lets us pass any value in as the argument users. One thing to  note is that when use
        // a wildcard, the java compiler is going to create an anonymous type under the hood. It creates a capture class,
        // and the reason it has a number is that we could be using multiple wildcards. The base type for this class is
        // the Object Class in Java. However, if we want the wildcard parameters to accept a specific data type, then we must add the
        // specific data type after we add the extend or super keyword.

        // so lets say we want to get a value from the GenericList of users, and store it as a User then we must use
        // extend keyword. Without extending to a specific Class, then we can only get values and store it in a variable
        // with Object data type, since that is the default.

        Object x1 = users.get(0); // putting any other class besides object without extending will cause an error, since the
        // CaptureClass right now is only a base type of Object Class, which is the parent of all classes in Java. So then
        // we extend the "?" to Users, and now the CaptureClass is a subclass of the User Class and the argument will now only accept
        // the User class or any of its subclasses, but nothing else.

        User x = users.get(0); // Now we can store a value from the GenericList of Users as a User variable, because the
        // User Class is now the parent of the Capture Class, however we can store it in a Instructor variable, because
        // the Instructor and Capture class are 2 different classes, inheriting from the same parent
    }


    public static void addUsers(GenericList<? super User> users) {

        // Now keep in mind that with the "extends" keyword we can only read from the list, if we want to add a value, then
        // we have to replace the "extend" keyword with the "super" keyword, what this does are that it the unknown class "?"
        // the parent of the User class, and the parent is the Object Class

        // so the "users" lis going to look like this:
        GenericList<Object> temp = new GenericList<>();
        // so the Java compiler is going to treat "users" in the parameters as the "temp" object.
        // Now in this list, I can add an instance of the Object class or any of its subtypes, which is literally every
        // class. So I can add a new User object or a new Instructor object, etc.

        users.add(new User(1));
        users.add(new Instructor(1));

        // We can read from a list and only store it as object, but not as a User variable, why? because when we try to
        // get a value from the list, the java compiler does not know whether if the object we are trying to get is
        // compatible with a user, it could be a String, a Car Object, etc. So we use extend if we want to read, and
        // super if we want to add.




    }
}
