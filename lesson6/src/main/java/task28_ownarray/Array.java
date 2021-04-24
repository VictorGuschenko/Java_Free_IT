package task28_ownarray;

import java.util.Arrays;

public class Array<T> {
    private T[] objects;

    public Array(int initialSize) {
        objects = (T[]) new Object[initialSize];

    }

    public void setElementByIndex(T element, int index) {
        objects[index] = element;
    }

    public T get(int index) {
        return objects[index];
    }
    public int length(){
        return objects.length;
    }

    @Override
    public String toString() {
        return "Array{" +
                "objects=" + Arrays.toString(objects) +
                ", array length: " + objects.length +
                '}';
    }
}
