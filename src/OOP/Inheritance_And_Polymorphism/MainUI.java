package OOP.Inheritance_And_Polymorphism;

public class MainUI {
    public static void main(String[] args) {
        var control = new TextBox();
        control.enable();
        control.setText("dert");

        System.out.println(control.toString());
        System.out.println(control.getIsEnabled());
        System.out.println(control.getText());
    }


}
