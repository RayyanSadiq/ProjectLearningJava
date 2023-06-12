package JavaBasics.Operators;

public class Logical_operators {
    public static void main(String[] args) {
        boolean hasLibraryCard = true;
        boolean isLocalCitizen = false;
        boolean isForeignCitizen = false;

        boolean checkoutEligible = (isForeignCitizen || isLocalCitizen) && hasLibraryCard;
        // here "||" means "or"  which basically means either one of the conditions given has to be true otherwise
        // it returns false. The "&&" sign is used to represent "and" which means both conditions given have to be
        // true, otherwise it returns false
        System.out.println(checkoutEligible);
    }
}
