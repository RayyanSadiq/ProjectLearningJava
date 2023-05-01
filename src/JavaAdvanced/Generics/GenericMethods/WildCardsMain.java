package JavaAdvanced.Generics.GenericMethods;

import JavaAdvanced.Generics.GenericList;
import JavaAdvanced.Generics.TheComparableInterface.User;

public class WildCardsMain {
    public static void main(String[] args) {
        var users = new GenericList<User>(); // here if we put User in the generic list, it will create an object called
        // GenericList and it's T variable will be Users.
        User use = new Instructor(12);

        Utils.printUsers(users);// However if we put Instructors instead of Users, we will get an
        // error here. This is because "GenericList<Instructors>" is not a subclass of "GenericClass<Users>", so it cant
        // upcast it. Here we are dealing with a single class which is "GenericList" and it will accept any reference type
        // as its variable "T". The GenericList class cannot be a subclass of itself, "T" is just a parameter, and we cant upcast
        // that.

        // This is what wildcards came to fix
        Utils.printUsers(new GenericList<Instructor>());

    }
}
