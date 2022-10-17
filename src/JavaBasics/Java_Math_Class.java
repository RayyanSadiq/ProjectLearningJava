package JavaBasics;

public class Java_Math_Class {
    public static void main(String[] args) {
        double integer1 = 23.3;
        System.out.println(Math.round(integer1));
        System.out.println(Math.ceil(integer1));
        System.out.println(Math.floor(21.9));
        double integer2 = Math.max(1.2,29);
        System.out.println(integer2);
        System.out.println(Math.random() * 100); // Math.random gives any value between 0 and 1, we multiply the random
        // chosen value to make any random number from 0 to 100, and we could take it even further from 0 to 1000, and so on
        System.out.println((int) (Math.random()*15)+1); // prints a value 1 to 15 including 1 and 15. It also truncates
        // it, giving us an int result, or A result with no decimal values.




    }
}
