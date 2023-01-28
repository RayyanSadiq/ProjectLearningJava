package JavaSmallProjects.MagicCards;

public class NotValidRankException extends Exception{

    public NotValidRankException() {
         super("This rank is invalid or does not exist");
    }
    public NotValidRankException(String message) {
        super(message);
    }
}
