package JavaSmallProjects.Unit3CW;

public class Unit3Methods {

    public static void ageAbillity(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("age can't be negative");
        }

        System.out.println( (age >= 14 ? "Can": "Is not eligible to") + " Work" );
        System.out.println( (age >= 15 ? "Can": "Is not eligible to") + " Travel" );
        System.out.println( (age >= 16 ? "Can": "Is not eligible to") + " Drive" );
        System.out.println( (age >= 18 ? "Can": "Is not eligible to") + " Vote, Can Marry, and Can Buy a House\n" );
        System.out.println( (age >= 35? "Can": "Is not eligible to") + " Can be nominated as a President\n" );
        System.out.println( (age >= 62 ? "Can": "Is not eligible to") + " Can retire Early" );
        System.out.println( (age >= 65 ? "Can": "Is not eligible to") + " Can retire" );

    }

    public static void PointsUpdate(int age) {


    }

}
