package JavaSmallProjects.CarProject;

public class CarMain {
    public static void main(String[] args) {

        var car = new CarClass("tesla","123",false,2);

        try {
            car.removePassengers(-3);
        }
        catch (IllegalArgumentException ex) {
            System.out.println("The argument given is invalid, try again");
        }

        car.getInfo();
        System.out.println(CarLib.isRealBrand(CarLib.capitalize("Dodge")));

        System.out.println("\n");

        car.addNewPassengers(50);
        car.setModel(792);
        car.setIsConvertible(true);
        car.setBrand("Lincoln");
        car.getInfo();

    }
}
