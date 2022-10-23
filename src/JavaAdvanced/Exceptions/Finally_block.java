package JavaAdvanced.Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Finally_block {
    public static void show() {
        FileReader reader = null;

        try {
            reader = new FileReader("file.txt");
            var value = reader.read();
            reader.close(); // the problem here is that of the above code throws an error, the line below will not
            // execute, which is leaving the file open which is not good.

        }
        catch (IOException ex) {
            System.out.println("could not read data");
        }
        finally {// the final block is always executed, no mater if there is an exception or not.
            if (reader != null){ // checks if the reader isn ot null in case file does not exist
                try {
                    reader.close();//  in case the file does not exist we catch the error and if it does exist, then it
                    // closes it
                } catch (IOException e) {
                    e.printStackTrace(); // generally speaking this code we have implemented here is very messy, their
                    // is a better way to do this, the main take way is that finally blocks always executes.
                }
            }
        }
    }
}


