package JavaSmallProjects.MagicCards;

public class NotValidModelException extends Exception{

    public NotValidModelException() {
        super("This model is invalid or does not exist");
    }
    public NotValidModelException(String message) {
        super(message);
    }
}

