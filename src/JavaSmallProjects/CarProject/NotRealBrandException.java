package JavaSmallProjects.CarProject;

public class NotRealBrandException extends Exception{
    public NotRealBrandException () {
        super("The brand given does not exist");
    }

    public NotRealBrandException (String message) {
        super(message);
    }
}
