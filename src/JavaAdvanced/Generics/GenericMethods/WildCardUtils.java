package JavaAdvanced.Generics.GenericMethods;

import JavaAdvanced.Generics.MainDirectory.GenericList;
import JavaAdvanced.Generics.TheComparableInterface.User;

public class WildCardUtils {


    public static void printUser(User user) {
        System.out.println(user);
    }



    // class CaptureClass#1 {}
    // class CaptureClass#1 {} extends User {}



    public static void printUsersNotFixed(GenericList<User> users) {
        Object x1 = users.get(0);
        User x = users.get(0);
    }

    public static void printUsersFixed(GenericList<? extends User> users) { // here we put "?" in the parameter of the GenericList, which
        // is the wildcard symbol. This lets us pass any value in as the argument users. One thing to  note is that when use
        // a wildcard, the java compiler is going to create an anonymous type under the hood. It creates a capture class,
        // and the reason it has a number is that we could be using multiple wildcards. The base type for this class is
        // the Object Class in Java. However, if we want the wildcard parameters to accept a specific data type, then we must add
        // the extends or super keyword.

        // so when extending to Users it makes the capture class behind the Scenes becomes decedent of Users. This allows us to store
        // elements from the GenericList as Users. However, we cannot store Instructor types because that Class is another
        // descendant completely, and we can only store parents of the CAP class. Here is the hierarchy below when extending


        //                                              Object Class
        //                                                   |
        //                                                   |
        //                                                   |
        //                                               User Class
        //                                                   |
        //                                                   |
        //                                                   |
        //                                         <------------------->
        //                                         |                   |
        //                                         |                   |
        //                                         |                   |
        //                                     Instructor          CAP#1 Class


        Object x1 = users.get(0);

        User x = users.get(0); // Now we can store a value from the GenericList of Users as a User variable, because the
        // User Class is now the parent of the Capture Class, however we can store it in a Instructor variable, because
        // the Instructor and Capture class are 2 different classes, inheriting from the same parent. However, we cannot add
        // because we can only add the CAP class and it's descendant, but we do not have access to the CAP class but we
        // can put it into a position where it will become a parent class with the super keyword.
    }


    public static void addUsers(GenericList<? super User> users) {

        // Now keep in mind that with the "extends" keyword we can only read from the list, if we want to add a value, then
        // we have to replace the "extend" keyword with the "super" keyword, what this does are that it makes the CAP class the
        // parent class. What this does is allow any descendants of the CAP class to be added to the list. However, we cannot
        // read into a list or get values because then we have to be down casting a parent classes, and in Java we cannot
        // downcast parent classes at all because although water is type of liquid, not all liquids are water. We can
        // upcast to the Object class which is why we can read if casting it up to a Object class. All in all super is for adding
        // to a list and extends is used for getting values or reading from a list.

        users.add(new User(1));
        users.add(new Instructor(1));

        //                                              Object Class
        //                                                   |
        //                                                   |
        //                                                   |
        //                                               CAP Class
        //                                                   |
        //                                                   |
        //                                                   |
        //                                               User Class
        //                                                   |
        //                                                   |
        //                                                   |
        //                                            Instructor Class

    }
}

