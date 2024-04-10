package com.LearningProject.JavaSmallProjects.PersonProject;

public class PersonClass {
    private  String language;
    private  double height;
    private  double weight;

    public PersonClass (String language){
        this.language = language;
        System.out.println(" good to be born and speaking " + this.language);
    }

    public PersonClass (String language, double height, double weight){
        this.language = language;
        setHeight(height);
        setWeight(weight);
        System.out.println("Good to be born with "+ height + "inch height, " + weight + "lbs weight, and speaking " + language);
    }

    private void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("height cannot below zero");
        }
        this.height = height;
    }
    private void setWeight(double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("weight cannot below zero");
        }
        this.weight = weight;
    }

    public String getLanguage() {
        return language;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void getAttributes() {
        System.out.println("I am " + height + " inch tall, " + weight + "lbs, and speak " + language);
    }







}
