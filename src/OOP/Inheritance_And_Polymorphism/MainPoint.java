package OOP.Inheritance_And_Polymorphism;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MainPoint {
    public static void main(String[] args) {
        var point1 = new PointClass(1,2);
        var point2 = new PointClass(1,2);
        System.out.println(point2.equals( point1)); // over here we are checking out our new overridden equals method
        System.out.println(point2.hashCode()); // here we are checking our overridden hashcode method.
        System.out.println(point1.hashCode()); // since this object has the same coordinates as the other one, they both
        // have the same hash code
    }
}
