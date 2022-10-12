package JavaSmallProjects.TriangleLibary;

public class TriangleFunctions {

    private static double Hypotenuse(double height, double base) {
        return Math.sqrt( Math.pow(height,2) + Math.pow(base,2));
    }

    public static double sin (double height, double base) {
        return height/Hypotenuse(height,base);
    }

    public static double cos (double height, double base) {
        return base / Hypotenuse(height, base);
    }

    public static double tan (double height, double base) {
        return height/base;
    }


}
