package JavaBasics.DataTypes;

public class Arithmetic_operations {
    public static void main(String[] args) {
        int x = 1; // since x is initialized as an integer, putting any value that's not an integer like a decimal will
        // cause an error.
        double y = 1; // Decimals and fraction are stored in doubles or floats. Putting Integers in here also fits

        // For doing arithmetic operations in code, we use arithmetic operators which are +,-,*,/,++,--,=, and %.
        // we use these operators on operands, which basically means numbers
        int a = x + 2; // this is how we use an operator on an operand in java, here we are using the additive operator
        System.out.println(a = a + x);
        a +=x; // this is a shortcut for what above, this is called an augmented assignment operator. This does exactly on what's
        // happening on a's initialization.

        int b = x - 2;
        System.out.println(b = b - x);
        System.out.println(b -=x);

        int c = x*2;
        c = c * 2;
        c *=2;


        int d = 1/2; // here you would expect a value of 0.5, but since it is an integer variable it will truncate or
        // remove all the number after the decimal point. It will not round it up, it will only remove the value after
        // the decimal leaving the answer to be the whole number before the decimal point, this will make y = 0.
        d = d/x;
        d /=x;
        System.out.println(d);

        System.out.println(x + d);
        System.out.println(x - d);
        System.out.println(x * d);
        //System.out.println(x / d); // this will cause an error since its 1/0. A variable that's not a double, will
        // raise this error, however declaring it as a double to fix this problem is considered a bad practice.
        // keep in mind 0/1 will not raise an error since they are zero ones inside in a zero.


        //Two last operators that are very useful are the increment operator ++, and the subtractive operator --
        int z = 1;
        z++; // this simply increments the operator by 1, however in initialization it works differently
        int j = z++; // here when using the assignment operator for "j", j is first aassigned to a value of 1, then z increments after
        // that making z = 2 while j still equals 1.
        j = ++z; // Here however j is 3 because ++ comes first meaning that z will be incremented first and then j will be assigned to
        //

        int g = 3;
        System.out.println(30%20);
    }
}
