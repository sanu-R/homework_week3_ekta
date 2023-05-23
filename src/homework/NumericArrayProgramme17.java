package homework;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

public class NumericArrayProgramme17 {

    public static void main(String[] args) {
        myNumber();
    }

    public static void myNumber() {
        int[] my_array = {
                1788, 2035, 1888, 1456, 2014, 2023, 1456,
                1999, 1934, 1456, 1977, 1845, 2389, 1933};
        String[] my_array1 = {"Banana", "Orange", "Mango", "Kiwi",
                "Cherry", "Plum", "Melon", "Grapes"};
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array));
        System.out.println("Sorted string array : " + Arrays.toString(my_array1));

    }


}
