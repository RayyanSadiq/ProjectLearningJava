import java.util.Arrays; // import Arrays to get array specific methods
public class Array {
    public static void main(String[] args){

    int [] array = new int[5]; // an array can be any data type however after creating the array, and it's
    // properties, it cannot be altered besides the values the arrays hold.
    array[1] = 4; // Arrays values can be changes by referring a certain index who values of which you want to change
    System.out.println(Arrays.toString(array)); //To print out Arrays, you must use the "toString" method to print out

    int [] array2 = {1,2,56,32,2};
    System.out.println(Arrays.toString(array2));
    Arrays.sort(array2); // here we can sort the values within an array
    System.out.println(Arrays.toString(array2) + '\n');


    int [][][] multidimensional_array = new int[2][2][2]; // multidimensional arrays can be declared by adding more brackets per dimension
    System.out.println(Arrays.deepToString(multidimensional_array)); // instead of "toString", we use "deepToString"
    // to convert a multidimensional array to a readable string
    int [][] multidimensional_array2 = {{1,2,3}, {4,5,6}};
    System.out.println(Arrays.deepToString(multidimensional_array2));



    }
}
