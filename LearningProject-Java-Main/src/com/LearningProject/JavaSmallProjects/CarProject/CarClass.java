package com.LearningProject.JavaSmallProjects.CarProject;

public interface CarClass extends Gettable {

    void setBrand(String brand) throws NotRealBrandException;

    void setModel(String model);

    void setModel(int model);

    void setIsConvertible(boolean convertible);

    void setNumPassengers(int numPassengers) throws NegativeNumberException;


}
