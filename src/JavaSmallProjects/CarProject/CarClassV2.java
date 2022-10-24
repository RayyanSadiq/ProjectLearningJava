package JavaSmallProjects.CarProject;

import java.io.IOException;

public class CarClassV2 implements CarClass {

    private String brand;
    private String model;
    private boolean isConvertible;
    private int numPassengers;


    public CarClassV2(String brand, String model, boolean isConvertible, int numPassengers)  {

        try {
            setBrand(brand);
        } catch (NotRealBrandException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        setModel(model);
        setIsConvertible(isConvertible);
        try {
            setNumPassengers(numPassengers);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    @Override
    public void setBrand(String brand) throws NotRealBrandException {
        if (!CarLib.isRealBrand(CarLib.capitalize(brand))) {
            throw new NotRealBrandException( brand + " is not a real brand");
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
    public void setNumPassengers(int numPassengers) throws IOException {
        if (numPassengers < 0) {
            throw new IOException("number of passengers cannot be below zero");
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
