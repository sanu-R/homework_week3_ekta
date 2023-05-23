package homework;

import java.util.Scanner;

/** 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class NumberProgramme16 {


    public static void main(String[] args) {
        myNumber();

    }
 public static void myNumber(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input a number: ");
     int v = sc.nextInt();
     if (v > 0){
         System.out.println("Number is POSITIVE");

     } else if(v < 0){
         System.out.println("Number is NEGATIVE ");
     }else{
         System.out.println("Number is ZERO ");
     }
 }





}
