package OOP.Inheritance_And_Polymorphism;

public class TextBox extends UIControl {

    /*protected String text; -- the code on the left uses the protected access modifier which makes it so as long as the
    file this field is being called in is within the same package, it is accessible, otherwise it is not. Using this
    modifier is looked down upon as a bad practice. The default access modifier is also a bad practice, we should only
    use private and public. */
    private String text; // private members are not inherited

    public TextBox () {
        super(false); // here we use super to refer to the class that is being inherited
        // from, we pass on the value through here and since we are only calling super by itself its calling thr constructor of the parent class.
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
