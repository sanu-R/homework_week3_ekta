package homework;

import java.util.Scanner;

/**
 * 9.Same as above program-8 using switch statement.
 */

public class AlphabetProgramme9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any one alphabet from A to F");
        String name = sc.nextLine();
        AlphabetProgramme9 obj = new AlphabetProgramme9();
        obj.myCity(name);
    }

    public void myCity(String alphabet) {
        switch (alphabet) {
            case "A":
                System.out.println("City name is Akola");
                break;
            case "B":
                System.out.println(" City name is : Berlin");
                break;
            case "C":
                System.out.println("City name is : Copenhagen");
                break;
            case "D":
                System.out.println("City name is : Div");
                break;
            case "E":
                System.out.println(" City name is : Eindhoven");
                break;
            case "F":
                System.out.println(" City name is : Florence");
                break;
            default:
                System.out.println("Invalid data");
        }
    }

}