package homework;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */

public class SpecificValueProgramme20 {
    public static boolean contains(int[] arr, int item) {
        for (int e : arr) {
            if (item == e) {
                return true;
            }
        }
return  false;

    }

    public static void main(String[] args) {
        int[] my_array = {
                2449, 2987, 4960, 1756, 2022, 1785, 1854, 3029, 3875,
                3857, 9583, 4295, 6393, 1245, 4252, 5632, 1978, 1923
        };
        System.out.println(contains(my_array, 2987));
        System.out.println(contains(my_array, 1988));

    }




}
