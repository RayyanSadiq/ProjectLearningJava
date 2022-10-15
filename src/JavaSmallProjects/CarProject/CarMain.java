package JavaSmallProjects.CarProject;

public class CarMain {
    public static void main(String[] args) {

        var car = new CarClass("tesla","123",false,2);
        car.removePassengers(1);
        car.getInfo();
        System.out.println(CarLib.isRealBrand(CarLib.capitalize("Dodge")));

        System.out.println("\n");

        car.addNewPassengers(50);
        car.setModel(-98);
        car.setIsConvertible(true);
        car.setBrand("Lincoln");
        car.getInfo();

    }
}
