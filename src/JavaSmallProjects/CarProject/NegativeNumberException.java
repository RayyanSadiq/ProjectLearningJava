package JavaSmallProjects.CarProject;

public class NegativeNumberException extends Exception{
    public NegativeNumberException() {
        super("value cannot be a negative number");
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}
