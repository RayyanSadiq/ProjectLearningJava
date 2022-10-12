package OOP.Inheritance_And_Polymorphism;

import java.util.function.BinaryOperator;

public class UIControl extends Object { //here UIControl class is inheriting the Object class from Java. Every class made
    //in Java already has this class inherited automatically which is why there are additional methods accessible in an
    // object besides the class they were created from.
    private boolean isEnabled;

    public  UIControl (boolean isEnabled ) {
        this.isEnabled = isEnabled;
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean getIsEnabled(){
        return isEnabled;
    }
}
