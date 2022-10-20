package JavaSmallProjects.CarProject;

public class CarClass {

    private String brand;
    private String model;
    private boolean isConvertible;
    private int numPassengers;

    public CarClass (String brand, String model, boolean isConvertible, int numPassengers) {
        setBrand(brand);
        setModel(model);
        setIsConvertible(isConvertible);
        setNumPassengers(numPassengers);
    }

    public void setBrand(String brand) {
        if (!CarLib.isRealBrand(CarLib.capitalize(brand))) {
            throw new IllegalArgumentException( brand + " is not a real brand");
        }
        this.brand = CarLib.capitalize(brand);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModel(int model) {
        setModel(Integer.toString(model));
    }

    public void setIsConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public void setNumPassengers(int numPassengers) {
        if (numPassengers < 0) {
            throw new IllegalArgumentException("number of passengers cannot be below zero");
        }
        this.numPassengers = numPassengers;
    }

    public void addNewPassengers(int newPassengers) {
        if (newPassengers < 0) {
            throw new IllegalArgumentException("You cannot add negative passengers");
        }
        numPassengers += newPassengers ;
    }

    public void removePassengers(int passengersRemoved) {
        if (passengersRemoved < 0 || numPassengers - passengersRemoved < 0) {
            throw new IllegalArgumentException("You cannot remove negative passengers");
        }
        numPassengers -= passengersRemoved ;
    }

    public void getInfo() {
        System.out.println("Car: " + brand + " " + model) ;
        System.out.println(isConvertible == true ?  "It is a convertible" : "It is not a convertible");
        System.out.println("Car Passenger Count: " + numPassengers);
    }
}
