package JavaSmallProjects.MagicCards;

public class NotValidSuitException extends Exception{

    public NotValidSuitException() {
        super("This suit is invalid or does not exist");
    }
    public NotValidSuitException(String message) {
        super(message);
    }
}
