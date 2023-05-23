package homework;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math,
 * Science and English marks (marks is between 0 to 100 and if it is out of range print error
 * message “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and
 * result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

public class ResultProgrammeP3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter student name: ");
        String name = sc.next();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Math marks: ");
        int mathMarks = sc.nextInt();
        validateMarks(mathMarks);

        System.out.print("Enter Science marks: ");
        int scienceMarks = sc.nextInt();
        validateMarks(scienceMarks);

        System.out.print("Enter English marks: ");
        int englishMarks = sc.nextInt();
        validateMarks(englishMarks);

        int totalMarks = mathMarks + scienceMarks + englishMarks;
     double percentage = (totalMarks / 3.0);

        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else {
            grade = "C";
        }

        System.out.println("___________________________________________");
        System.out.println("|                                         |");
        System.out.println("|                Mark Sheet               |");
        System.out.println("|_________________________________________|");
        System.out.println("|  Name           :   " + name + "          |");
        System.out.println("|  Roll No        :   " + rollNo + "         |");
        System.out.println("|_________________________________________|");
        System.out.println("|  Subjects       :   Marks               |");
        System.out.println("|_________________________________________|");
        System.out.println("|  Math           :   " + mathMarks +    " |");
        System.out.println("|  Science        :   " + scienceMarks +  "|");
        System.out.println("|  English        :   " + englishMarks +                "|");
        System.out.println("|_________________________________________|");
        System.out.println("|  Total          :   " + totalMarks + "                 |");
        System.out.println("|_________________________________________|");
        System.out.println("|  Percentage     :   " + percentage + "                |");
        System.out.println("|  Result         :   " + result +   "                |");
        System.out.println("|  Grade          :   " + grade +   "                   |");
        System.out.println("|_________________________________________|");
    }

    public static void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        }


    }
}