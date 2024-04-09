package com.Droid7X.JavaSmallProjects.Unit3Projects.IsPrime;
import java.util.Scanner;

public class MainPrime {
    public static void main(String[] args) {
        var response = new Scanner(System.in);
        String input = " ";

        while (true) {
            input = response.nextLine();
            if (PrimeLib.isNumber(input)) {
                System.out.println(PrimeLib.isPrime(Integer.parseInt(input)) + "\n");
            }
            else if (input.equals("end")) {
                break;
            }
            else {
                System.out.println("Only Whole numbers are accepted try again\n");
            }
        }
    }
}
