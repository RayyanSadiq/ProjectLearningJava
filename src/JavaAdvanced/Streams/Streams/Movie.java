package JavaAdvanced.Streams.Streams;

public class Movie {

    private String name;

    private int likes;

    public Movie(String name, int likes) {
        this.name = name;
        this.likes = likes;

    }

    public int getLikes() {
        return likes;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "name=" + name + ' ' + "likes=" + likes;
    }
}
