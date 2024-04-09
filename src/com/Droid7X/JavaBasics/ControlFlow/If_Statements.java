package com.Droid7X.JavaBasics.ControlFlow;

public class If_Statements {
    public static void main(String[] args) {
        int temp = 34;

        if (temp >= 30) {  // >= means greater than or equal to
            System.out.println("it's hot. . .panting noises");
        }
        else if (temp > 10 && temp < 30) { // if temp not more than 30 or equal to then it will go this code
            System.out.println("Brr. . . its cold");
            String d = "jj";
        }
        else { // else is used as the last alternate condition in an if statement
            System.out.println(" its global freezing time");
        }

        // Simplifying if statements:

        Byte Hp = 12;
        boolean is_Full_Health = (Hp == 100); // Here we can assign boolean expressions to a boolean variable in its
        // declaration making it much cleaner and easier to read.
        System.out.println(is_Full_Health);
    }
}
