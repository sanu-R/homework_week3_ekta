package homework;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class OddEvenProgramme1 {
    public static void main(String[] args) {
        oddEven();


    }

    public static void oddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "is an even number" : " is an odd number";

        System.out.println("number:" + result);


    }


}
