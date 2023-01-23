package JavaSmallProjects.Unit3Projects.IsPrime;

public class NegativeNumberException extends Exception {

    public NegativeNumberException() {
        super("value cannot be an negative number");
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}
