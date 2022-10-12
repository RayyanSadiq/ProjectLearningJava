package OOP;

public class Classes { // public is access modifier which is an access keyword to make it accessible to other parts of
    // the program or not. The first word needs to be capitalized for classes

    public String text = ""; // Field, public is usually what we do not use for fields, they are kept private to the class.
    // we're going to assign this variable to empty double quotes because then it will be null type, which will throw
    // an error if the user doesn't set the variable to anything and refers to it.

    //another thing to keep in mind is that the size of an object is the class it is created from, and the size of the
    // class is its fields, so this class is currently the size of one string variable which is 8 bytes

    public void setText(String text) {
        this.text = text; // "this." is a reference to a current object, so it is referring to field "text", we use
        // this in case the parameter and field have the same name, of course you cna change the name of either of them
        // to avoid this problem, but this is another solution if that option is not available.

    }

    public void clear() {
        text = "";
    }
}
