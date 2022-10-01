package JavaBasics;

import java.text.NumberFormat;

public class Formatting_numbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(123.456);
        System.out.println(result);

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String result2 = percentage.format(123.456);
        System.out.println(result2);

            NumberFormat Integer = NumberFormat.getIntegerInstance();
        String result3 = Integer.format(123.456);
        System.out.println(result3);
    }
}

