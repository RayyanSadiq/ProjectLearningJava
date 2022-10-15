package OOP.Inheritance_And_Polymorphism;

public class MainUI_2 {
    public static void main(String[] args) {

        UIControl[] controls = {new TextBox(), new CheckBox()}; // here we are creating new objects in an array
        for (var control : controls) { // here we are iterating through each object
            control.render();// here we are iterating through each object and calling the render method each object has.
            // this is polymorphism as the "control" is taking many forms.
        }
    }
}
