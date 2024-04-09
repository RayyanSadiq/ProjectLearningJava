package com.Droid7X.JavaBasics.ControlFlow;

public class For_Loops {
    public static void main(String[] args) {
//        for (int i = 1; i<=5; i++) {
//            System.out.println("Attempt . . . "+ i);
//        }
//
//        System.out.println("\n");
//
//        String[] color_pencils = {"red", "blue", "yellow"};
//        for (int i = 0; i < color_pencils.length; i--) {
//            System.out.println(color_pencils[i]);
//        }
//
//        System.out.println("\n");
//
//        for (String pencil : color_pencils) {
//            System.out.println(pencil);
//        }
        int i = 10;
        try {
            System.out.println("Apple");
            if (i > 0) {
                throw new IllegalArgumentException();
            }
            System.out.println("Banana");
        } catch (IllegalArgumentException e) {
            System.out.println("Coconut");
        } catch (Exception e) {
            System.out.println("Donut");
        } finally {
            System.out.println("Egg");
        }

        System.out.println("Flour");
    }
}
