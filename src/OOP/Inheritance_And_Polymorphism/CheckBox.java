package OOP.Inheritance_And_Polymorphism;

public class CheckBox extends UIControl{

    public CheckBox() {
        super(false);
    }

    @Override
    public void render() {
        System.out.println("render checkbox");
    }
}
