package homework;

/** 18. Write a Java program to sum values of an array.
 */

public class SumValueProgramme18 {
    public static void main(String[] args) {
myAdd();
    }
    public static void myAdd(){
        int my_array []= { 1 ,2 ,3 ,4,4,6,7,8,9,10};
        int sum = 0;
        for (int e : my_array)
            sum += e;
        System.out.println("The sum is  " + sum);


    }
}
