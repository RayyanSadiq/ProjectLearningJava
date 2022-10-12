package OOP.Inheritance_And_Polymorphism;

public class TextBox extends UIControl {

    /*protected String text; -- the code on the left uses the protected access modifier which makes it so as long as the
    file this field is being called in is within the same package, it is accessible, otherwise it is not. Using this
    modifier is looked down upon as a bad practice. */
    private String text; // private members are not inherited

    public TextBox () {
        super(false); // should be very first statement
        text = "";
    }

    public void setText (String text) {
        this.text = text;
    }

    public String getText () {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }

    public void clear() {
        text = "";
    }
}
