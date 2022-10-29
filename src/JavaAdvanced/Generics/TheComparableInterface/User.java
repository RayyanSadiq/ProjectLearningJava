package JavaAdvanced.Generics.TheComparableInterface;

public class User implements Comparable<User> {

    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public String toString() { // this is being used in the generic methods folder
        return "Points:" + points;
    }

    @Override
    public int compareTo(User other) {
        // the purpose of the compareTo method is that if:
        // this.variable < other.variable, then return -1
        // this.variable == other.variable, then return 0
        // this.variable > other.variable, then return 1
        return points - other.points;


    }
}
