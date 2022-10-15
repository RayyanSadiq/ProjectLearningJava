package JavaSmallProjects.CarProject;

public class CarLib {

    public static boolean isRealBrand(String brand) {

        boolean isExist = false;

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
                "Arch Motorcycles"
        };

        for (String carBrand : realBrands) {
            if (carBrand.equals(brand)) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

   public static String capitalize(String string){
        string = string.replaceAll("\\s", "");
        if (string == null || string.isEmpty()) {
            return string;
        }
        return string.substring(0,1).toUpperCase() + string.substring(1);
    }
}
