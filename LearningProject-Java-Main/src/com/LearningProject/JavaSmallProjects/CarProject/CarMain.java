package com.LearningProject.JavaSmallProjects.CarProject;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int x=0;
        System.out.println("Welcome to car creator. type any of the commands below");

        var car = new CarClassV2("None","None",false,0);
        while (x<1) {
            System.out.println("Set info");
            System.out.println("Get info");

            System.out.println("\ncommand:");
            String userInput = input.nextLine();
            System.out.println("\n");

            try {
                CarLib.process(userInput, car );
            } catch (NotRealBrandException | NegativeNumberException e) {
                System.out.println(e.getMessage() + ", try again\n");
            }
        }
    }
}
