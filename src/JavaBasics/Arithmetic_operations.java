package JavaBasics;

public class Arithmetic_operations {
    public static void main(String[] args) {
        int x = 1; // since x is initialized as an integer, putting any value that's not an integer like a fraction will
        // cause an error.
        int y = 1/2; // here you would expect a value of 0.5, but since it is an integer variable it will truncate or
        // remove all the number after the decimal point. It will not round it up, it will only remove the value after
        // the decimal leaving the answer to be the whole number before the decimal point, this will make y = 0.
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        //System.out.println(x / y); // this will cause an error since its 1/0, an variable that's not a double, will
        // raise this error, however declaring it as a double to fix this problem is considered a bad practice.
        // keep in mind 0/1 will not raise an error since they are zero ones inside in a zero.

        System.out.println(11%3); // This is the modulus operator, this will print out the remainder, so in this case it would 2
        x++; // This is a shortcut to x = x + 1
        System.out.println(x);
        y--; //This is a shortcut to y = y - 1
        System.out.println(y);
        x+=4; // This is a shortcut to x = x + 4
        System.out.println(x);
        x-=10; // This is a shortcut to x = x - 10
        System.out.println(x);
        x/=4; // This is a shortcut to x = x / 4
        System.out.println(x);
        x*=100; // This is a shortcut to x = x * 100
        System.out.println(x);

    }
}
