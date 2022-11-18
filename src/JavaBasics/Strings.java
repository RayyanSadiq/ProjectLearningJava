package JavaBasics;

public class Strings {
    public static  void main(String[] args) {
        String message = "Hello World"; // String is a reference type
        System.out.println(message + "!!");// The process of adding 2 strings together is called concatenation
        System.out.println(message.endsWith("!!")); // checks if String ends with the given value, if so prints true.
        // This will give false because !! was added to the print function, not the variable itself. You can concatenate
        // when declaring variables.
        int characters_in_string = message.length(); // message.length gives the number of chars in a given string
        System.out.println(characters_in_string);
        System.out.println(message.indexOf('H'));// Indexes the given value and returns position, if value is not
        // present it returns -1
        System.out.println(message.indexOf("!")); // returns -1
        System.out.println(message.replace("ll","gg")); // prints "Heggo world"
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println("\n");

        //-----------------------------------------------Escape sequences---------------------------------------------\\
        System.out.println("look its a backslash = \\");
        System.out.println("with back slash we can go print quotes and double quotes in strings,\'\"\nwe can also go to the next line");
        System.out.println("\n");
        //--------------------------------------------The Substring method--------------------------------------------\\
        System.out.println(message.substring(0,3).toUpperCase()); // String methods can be combined like this
        /* the way substring work is that the first parameter takes
        in the beginning index to print and the second parameter takes the range to print up to. The letter at the third index
        however will not be in the String, only up till the third letter, but not including the third letter.*/

        String halfString = message.substring(2);
        System.out.println(halfString);
        // Another thing to keep in mind is that when only the beginning index is given to the substring method, then it will
        // print all elements from the beginning index till the end.

        // Like many other languages, when indexing iterables, the index position ranges from [0-infinty], it starts
        // from 0, not 1.

        System.out.println(message.substring(0,2) + message.substring(message.length() -2));
        int position = message.indexOf("orl");
        System.out.println(message.substring(position));

        System.out.println("\n"); // this line is purely for spacing aesthetic


        //------------------------------------------Compare to method-------------------------------------------------\\

        String string1  = "hello";
        String string2 = "hello";
        String string3 = "me";

        System.out.println(string1.compareTo(string2));
        // if compareTo value = 0, then both values being compared are equal, otherwise if its positive that means
        // it is greater than the value it is being compared to. If it's negative, then it the value it is being comapred
        // to is less than it


    }
}
