package com.LearningProject.JavaAdvanced.Generics.MainDirectory;

public class TypeErasure<T extends Comparable> { //One thing to note here is that constraints don't apply to just classes
    // but also to interfaces like the Comparable interface which is used to compare to objects to each other that are
    // comparable. This also means that if an object that is not comparable or does not have the comparable interface
    // implemented, then that data type will not be allowed as valid data type for this genericClass. Here we can also
    // add multiple Interfaces not just one. Meaning we can add multiple restriction like if a class is cloneable and,
    // comparable, and etc.

    //behind the scenes the compiler replaces all the <T> parameters as with the Object class, kinda like how we did the
    // poor solution for generics, the difference is ensuring compile time type safety and the removal of the excess casting
    // we had to do. The only time when T is not a Object class is because of constraints, so for example if I extend to Number
    // class then all <T> will be replaced with the Number class instead of Object class. The replacing of <T> with
    // a Class is called Type erasure.

}
