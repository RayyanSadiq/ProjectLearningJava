package JavaSmallProjects.Unit3CW;

public class Unit3Methods {

    public static void ageAbility(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("age can't be negative");
        }

        System.out.println( (age >= 14 ? "Can": "Is not eligible to") + " Work" );
        System.out.println( (age >= 15 ? "Can": "Is not eligible to") + " Travel" );
        System.out.println( (age >= 16 ? "Can": "Is not eligible to") + " Drive" );
        System.out.println( (age >= 18 ? "Can": "Is not eligible to") + " Vote, Marry, and Buy a House\n" );
        System.out.println( (age >= 35? "Can": "Is not eligible to") + " Can be nominated as a President\n" );
        System.out.println( (age >= 62 ? "Can": "Is not eligible to") + " Can retire Early" );
        System.out.println( (age >= 65 ? "Can": "Is not eligible to") + " Can retire" );

    }

    public static void pointsUpdate(int homeGoals, int guestGoals) {

        if (homeGoals < 0 || guestGoals < 0) {
            throw new IllegalArgumentException("goal points can't be negative");
        }

        if (homeGoals > guestGoals) {
            System.out.println("Home goals is > Guest goals by " + (homeGoals - guestGoals) );
        }
        else if (homeGoals < guestGoals) {
            System.out.println("Home goals is < Guest goals by " + (guestGoals - homeGoals) );
        }
        else {
            System.out.println("Home goals is == Guest goals ");
        }

    }

    public static void incomeTax(int income ){

        double taxPercentage = 0;

        if (  0 < income && income < 10_275 ) {
            taxPercentage = 0.10;
        }
        else if (10_275< income && income < 41_776) {
            taxPercentage = 0.22;
        }
        else if (41_776 < income && income < 89_075) {
            taxPercentage = 0.22;
        }
        else if (89_076 < income && income < 170_050) {
            taxPercentage = 0.24;
        }
        else if (170_051 < income && income < 215_950) {
            taxPercentage = 0.32;
        }
        else if (215_951 < income && income < 539_900) {
            taxPercentage = 0.35;
        }
        else if (539_901 < income) {
            taxPercentage = 0.37;
        }

        System.out.println("Your Tax Percentage is " + (taxPercentage*100));
        System.out.println("Your Tax Amount is " + (income * taxPercentage ));
        System.out.println("Your income is now " + (income-(income * taxPercentage)) + " after tax");
    }

}
