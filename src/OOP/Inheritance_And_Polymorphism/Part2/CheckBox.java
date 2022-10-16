package OOP.Inheritance_And_Polymorphism.Part2;

import OOP.Inheritance_And_Polymorphism.Part2.UIControl;

public class CheckBox extends UIControl {

    public CheckBox() {
        super(false);
    }

    @Override
    public void render() {
        System.out.println("render checkbox");
    }
}
