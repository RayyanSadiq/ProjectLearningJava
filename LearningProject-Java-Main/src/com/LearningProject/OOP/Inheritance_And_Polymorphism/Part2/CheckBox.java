package com.LearningProject.OOP.Inheritance_And_Polymorphism.Part2;

public class CheckBox extends UIControl {

    public CheckBox() {
        super(false);
    }

    @Override
    public void render() {
        System.out.println("render checkbox");
    }
}
