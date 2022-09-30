public class Casting {
    public static void main(String[] args) {
       // implicit casting
       // This is when a smaller data type can fit into a larger data_type, therefore not allowing any data to be lossed
       // byte -> short -> int -> long
       byte var1 = 12;
       int var2 = var1 + 100000 ;
       long var3 = var2 + 230000;

       //Explicit casting

        double var4 = 1.3;
        int var5 = (int)var4 + 3; // here we are trying to perform an operation between two data types which are not
        // compatible, to fix this, we perform casting which is to change or cast a new data type to an existing variable
        // or value. We just cast var4 from a double type to becoming an integer data type. This means that var4 will be
        // truncated and turn in to 1 instead of 1.3. This type of casting is called "Down Casting" because we are casting
        // it to a lower data type.
        System.out.println(var5);

        String var6 = "123";
        int var7 = Integer.parseInt(var6) + 30; // here we are parsing the string and casting the String value to an
        // integer data type
        System.out.println(var7);



    }
}
