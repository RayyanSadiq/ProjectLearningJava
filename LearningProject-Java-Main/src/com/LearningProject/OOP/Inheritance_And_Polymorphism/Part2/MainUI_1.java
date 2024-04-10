package com.LearningProject.OOP.Inheritance_And_Polymorphism.Part2;

public class MainUI_1 {
    public static void main(String[] args) {
        // var control = new UIControl(false);
        var textBox = new TextBox();

        show(textBox); // here we have a type of upcasting, since textBox is cast to UIControl. So this object is
        // being cast to its parent type. Which means this variable will enter as UIControl class in the method, but
        // it will remain a TextBox class by default
    }

    public static void show (UIControl control) {
        /* here we are down-casting the textBox variable which used to be a TextBox
        class that is now a UIControl class thanks to upcasting. However, in the case we want to use some
        TextBox class methods, we down-cast it by making it a TextBox class again by casting the given object in the
        control argument.

        However, this only works for objects that are originally made as a TextBox objects. This is
        because all TextBox objects are instances of UIControl, but not all UIControl objects are necessarily a TextBox
        it could be checkbox, or drop down list, because classes can be inherited by many other classes, it
        causes a casting error if a parent class is being downcast-ed to a specific descendant class. To avoid this we
         use the if-statement in place below*/
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("jello");
        }
        System.out.println(control); // here we don't call the toString method since the toString method is called
        // automatically when an object is being printed out.
    }


}
