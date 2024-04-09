package com.Droid7X.JavaSmallProjects.PersonProject;

public class PersonMain {
    public static void main(String[] args) {
        var Mohammad = new PersonClass("Arabic");
        var Thomas = new PersonClass("English", 23.9,7.5);
        var Jose = new PersonClass("English", 21.5,8.5);
        System.out.println("Mohamad speaks " + Mohammad.getLanguage());
        System.out.println("Mohamad is " + Mohammad.getHeight() + " inch tall");
        System.out.println("Thomas speaks " + Thomas.getLanguage());
        System.out.println("Thomas weighs " + Thomas.getWeight() + " lbs");
        System.out.println("Jose is " + Jose.getHeight() + " inch tall");
        System.out.println("Jose is " + Jose.getWeight() + " lbs");
        System.out.println("Jose is " + Jose.getWeight() + " lbs");
        Mohammad.getAttributes();
        Thomas.getAttributes();


    }
}