package homework;

import java.util.Scanner;

/** 10. Write a java program to input any two number and ask user to enter their
 *  symbol (+, -, /, *) find addition, Subtraction, multiplication and division
 *  according to their symbol (using if else)
 */
public class CalculateProgramme10 {

    public static void main(String[] args) {
        myCalculator();

    }
    public static void myCalculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers :");
        int first, second, addition, subtraction,multiplication;
        float division;
        first = sc.nextInt();
        second = sc. nextInt();
        addition = first + second;
        subtraction = first - second;
        multiplication = first * second;
        division = first / second;
        System.out.println("answer = " + addition );
        System.out.println("answer = " + subtraction );
        System.out.println("answer = " + multiplication);
        System.out.println("answer = " + division);






    }
}
