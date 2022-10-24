package JavaSmallProjects.CarProject;

import java.io.IOException;

public interface CarClass extends Gettable {

    void setBrand(String brand) throws NotRealBrandException;

    void setModel(String model);

    void setModel(int model);

    void setIsConvertible(boolean convertible);

    void setNumPassengers(int numPassengers) throws IOException;


}
