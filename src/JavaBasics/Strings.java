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

        //Escape sequences
        System.out.println("look its a backslash = \\");
        System.out.println("with back slash we can go print quotes and double quotes in strings,\'\"\nwe can also go to the next line ");




        // Like many other languages, when indexing iterables, the index position ranges from [0-infinty], it starts
        // from 0, not 1.



    }
}
