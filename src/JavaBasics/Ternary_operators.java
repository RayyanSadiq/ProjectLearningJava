package JavaBasics;

public class Ternary_operators {
    public static void main(String[] args) {
        byte number_of_pizza_boxes = 5;
        String order_Size =  number_of_pizza_boxes <= 5 ? "small" : "large" ;
        System.out.println(order_Size);

        int num1 = 4;
        int num2 = 7;

        System.out.print( num2 /num1 > 1 || num2 % num1 ==3 ? "first" : "second" );

    }
}
