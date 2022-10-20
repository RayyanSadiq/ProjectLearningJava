package JavaSmallProjects.CarProject;

public class CarClassV2 implements CarClass {

    private String brand;
    private String model;
    private boolean isConvertible;
    private int numPassengers;


    public CarClassV2(String brand, String model, boolean isConvertible, int numPassengers) {
        setBrand(brand);
        setModel(model);
        setIsConvertible(isConvertible);
        setNumPassengers(numPassengers);
    }

    @Override
    public void setBrand(String brand) {
        if (!CarLib.isRealBrand(CarLib.capitalize(brand))) {
            throw new IllegalArgumentException( brand + " is not a real brand");
        }
        this.brand = CarLib.capitalize(brand);
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public void setModel(int model) {
        setModel(Integer.toString(model));
    }

    @Override
    public void setIsConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    @Override
    public void setNumPassengers(int numPassengers) {
        if (numPassengers < 0) {
            throw new IllegalArgumentException("number of passengers cannot be below zero");
        }
        this.numPassengers = numPassengers;
    }


    @Override
    public void getInfo() {
        System.out.println("Car: " + brand + " " + model) ;
        System.out.println(isConvertible == true ?  "It is a convertible" : "It is not a convertible");
        System.out.println("Car Passenger Count: " + numPassengers);
    }
}
