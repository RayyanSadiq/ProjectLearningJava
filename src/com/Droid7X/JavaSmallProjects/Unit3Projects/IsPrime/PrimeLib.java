package com.Droid7X.JavaSmallProjects.Unit3Projects.IsPrime;

public class PrimeLib {

    public static boolean isPrime(int number) {

        if (number == 1) {
            return false;
        }
        else if (number == 2) {
            return true;
        }
        else if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i+=2) {
            if (number%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumber (String str) {
        if (str.equals("")) {
            return false;
        }
        for (int i = 0; i<str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
