package OOP.Inheritance_And_Polymorphism.Part2;

import java.util.Objects;
import java.util.function.BinaryOperator;

public abstract class UIControl extends Object { //here UIControl class is inheriting the Object class from Java. Every class made
    //in Java already has this class inherited automatically which is why there are additional methods accessible in an
    // object besides the class they were created from.

    // here the UIControl class is to provide some common code for its subclasses, we don't want to instantiate it, so in
    // this case we use the "abstract" keyword to make it, so we cannot instantiate it, only to make heritable to other
    // descendant classes.
    private boolean isEnabled;

    public  UIControl (boolean isEnabled ) {
        this.isEnabled = isEnabled;
    }

    public abstract void render(); //here we make this method abstract, which means all the class that inherit this
        // class will have to make themselves abstract or have the abstract method overridden in them

    public final void printHash(Object obj) { // final methods cannot be overridden
        System.out.println(obj.hashCode());
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
