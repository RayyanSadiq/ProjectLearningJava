package JavaSmallProjects.CarProject;
import java.util.Scanner;
public class CarLib {

    public static int increment(int counter) {
        return counter;
    }
    public static void process(String userInput, CarClass car, int counter){
        if (userInput.toLowerCase().equals("set info")) {
            var input = new Scanner(System.in);

            System.out.println("\nWhat is your brand? ");
            String brand = input.nextLine();
            car.setBrand(brand);

            System.out.println("\nWhat is your car model? ");
            String model = input.nextLine();
            car.setModel(model);

            System.out.println("\nis your car a convertible?");
            String response = input.nextLine();
            Boolean isConvertible = response.toLowerCase().equals("yes") || Boolean.parseBoolean(response.toLowerCase()) ? true : false;
            car.setIsConvertible(isConvertible);

            System.out.println("\nWhat is the number of passengers in your car?");
            int passengerNum = Integer.parseInt(input.nextLine());
            car.setNumPassengers(passengerNum);
        }
        else if (userInput.toLowerCase().equals("get info")) {
            System.out.println("\n");
            car.getInfo();
            System.out.println("\n");
        }
        else {

        }
    }

    public static boolean isRealBrand(String brand) {

        boolean isExists = false;

        String [] realBrands = {
                "Ural",
                "Tesla",
                "Rezvani",
                "Ram",
                "Harley Davidson",
                "Hummer",
                "Jeep",
                "Lincoln",
                "Ford",
                "Dodge",
                "Chrysler",
                "Chevrolet",
                "Cadillac",
                "Buick",
                "Arch Motorcycles",
                "None"

        };

        for (String carBrand : realBrands) {
            if (carBrand.equals(brand)) {
                isExists = true;
                break;
            }
        }
        return isExists;
    }

   public static String capitalize(String string){
        string = string.replaceAll("\\s", "");
        if (string == null || string.isEmpty()) {
            return string;
        }
        return string.substring(0,1).toUpperCase() + string.substring(1);
    }
}
