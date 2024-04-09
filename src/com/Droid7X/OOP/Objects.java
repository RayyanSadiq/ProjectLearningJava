package com.Droid7X.OOP;

public class Objects {
    public static void main(String[] args) {
        var object = new Classes(); // var allows the data_type to be whatever it assigned to, however it cannot be
        // changed since java variables have a static type. This applies for all normal java variables
        object.setText("");
        System.out.println(object.text);
        object.clear();
        System.out.println(object.text + "\nnothing is printed it seems");


    }
}
