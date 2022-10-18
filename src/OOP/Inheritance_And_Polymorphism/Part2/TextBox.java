package OOP.Inheritance_And_Polymorphism.Part2;

public class TextBox extends UIControl {

    /*protected String text; -- the code on the left uses the protected access modifier which makes it so that it is
    private, but the member is heritable. Using this type of modifier is looked as a bad practice, because it is
    confusing to use*/

    private String text; // private members are not inherited

    public TextBox () {
        super(false); // here we use super to refer to the class that is being inherited
        // from, we pass on the value through here and since we are only calling super by itself its calling the constructor of the parent class.
        // This should also be the very first statement in a class that is inheriting.
        text = "";
    }

    public void setText (String text) {
        this.text = text;
    }

    public String getText () {
        return text;
    }

    public void clear() {
        text = "";
    }

    @Override // over here we have an annotation, which basically pass extra information to the compiler
    // what overide allows us to do is override this method which was inherited from the built-in Object class, and
    // re-define it as a new method.
    public String toString() {
        return text;
    }

    @Override
    public void render() {
        System.out.println("render textbox");
    }
}
