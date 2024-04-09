package com.Droid7X.JavaAdvanced.Generics.TheComparableInterface;

public class UserMain {
    public static void main(String[] args) {
        var user1 = new User(10);
        var user2 = new User(-30);

        if (user1.compareTo(user2) < 0) {
            System.out.println("user1 is < user 2");
        } else if (user1.compareTo(user2) == 0) {
            System.out.println(" user1 is == user2");
        } else {
            System.out.println("user1 is > user2");
        }
    }
}
