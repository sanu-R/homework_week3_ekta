package homework;
/**Write a java program input sales id, seller's name, sales amount, and salary basic and
 then fined this sales
 Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
 >= 20,000 10%
 >= 10,000 5%
 < 10,000 2%

 */

import java.util.Scanner;

public class SalesProgramme7 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       salary();
    }

    public static void salary() {
        System.out.println("Enter Sales id");
        int a = sc.nextInt();
        System.out.println("Enter Seller's name");
        String b = sc.next();
        System.out.println("Enter Sales amount");
        double amount = sc.nextDouble();
        System.out.println("Enter Basic salary ");
        double salary = sc.nextDouble();
        double comission = 0;
        int rate = 0;

        if (amount >= 50000) {
            rate = 35;
            comission = amount * 0.35;
        }
        if (amount >= 50000) {
            rate = 20;
            comission = amount * 0.20;
        }
        if (amount >= 20000) {
            rate = 10;
            comission = amount * 0.10;
        }
        if (amount >= 10000) {
            rate = 5;
            comission = amount * 0.05;
        }
        if (amount < 10000) {
            rate = 2;
            comission = amount * 0.02;
        }
        System.out.println("Commission amount =" + comission);
        ;
    }





}
