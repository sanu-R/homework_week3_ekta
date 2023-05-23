package homework;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even.
 */


public class NumberOddOrEvenProgramme6 {
    public static void main(String[] args) {
        odd();


    }

    public static void odd() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");

        } else {
            System.out.println(number + " is an odd number.");
        }


    }
}


