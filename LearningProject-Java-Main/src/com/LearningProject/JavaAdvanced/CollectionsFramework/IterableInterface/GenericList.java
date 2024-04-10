package com.LearningProject.JavaAdvanced.CollectionsFramework.IterableInterface;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> { // The Iterable interface is a generic interface that implements 3 methods
    // one of which is mandatory to implement which is the iterator method.

    private T[] items =  (T []) new Object[10];

    private int count;

    public void add (T item) {
        items[count++ ] = item;
    }

    public T get (int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() { // now if we look closly at the return type of this method, it returns an iterator
        // object.
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T>{

        private GenericList<T> list;

        private int index;

        public ListIterator( GenericList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }

}
