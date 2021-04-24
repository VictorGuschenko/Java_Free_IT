package task28_ownarray;

import java.util.ArrayList;

/**
 * Написать класс, который умеет хранить в себе массив любых типов данных (int, long
 * etc.). Реализовать метод get(int index), который возвращает любой элемент
 * массива по индексу.
 */
public class ArrayRunner {

    public static void main(String[] args) {

        Array<Object> arrayObject = new Array<>(2);
        arrayObject.setElementByIndex("hi", 1);


        Array<Integer> arrayInt = new Array<>(5);
        System.out.println(arrayInt);
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayInt.get(i));
        }
        for (int i = 0; i < arrayInt.length(); i++) {
            arrayInt.setElementByIndex(i * 2,i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayInt.get(i));
        }

        Array<String> arrayString = new Array<>(3);
        arrayString.setElementByIndex("hello", 1);
        System.out.println(arrayString);

        Array<Array<Integer>> array = new Array<>(3);
        System.out.println(array);

        Array<ArrayList<Integer>> arrayList = new Array<>(3);
        arrayList.setElementByIndex(new ArrayList<>(3), 0);
        arrayList.setElementByIndex(new ArrayList<>(3), 1);
        arrayList.get(0).add(1);
        arrayList.get(0).add(2);
        arrayList.get(0).add(3);
        arrayList.get(1).add(4);
        arrayList.get(1).add(5);
        arrayList.get(1).add(6);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1)); //element 1 is an ArrayList;

    }

}