package homework;
/**WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
 */

import java.util.Scanner;

public class SalaryProgramme5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id : ");
        int employeeId = sc.nextInt();
        System.out.println("Enter Employee name : ");
        String employeeName = sc.next();
        System.out.println("Enter basic salary : ");
        double basicSalary = sc.nextDouble();
        salary(employeeId, employeeName, basicSalary);
    }
    public static void salary(int employeeId, String employeeName, double basicSalary) {

        double HRA = 0.1 * basicSalary;
        double TA = 0.08 * basicSalary;
        double DA = 0.09 * basicSalary;
        double PF = 0.2 * basicSalary;
        double grossSalary = basicSalary + HRA + TA + DA - PF;
        System.out.println("________________________________");
        System.out.println("|            Salary Slip       |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id    : " +employeeId+"          |");
        System.out.println("| Employee Name  : " +employeeName+"         |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary   : " +basicSalary+"      |");
        System.out.println("| HRA 10%        : "+HRA+"       |");
        System.out.println("| TA 8%          : "+TA+"       |");
        System.out.println("| DA 9%          : "+DA+"       |");
        System.out.println("| PF - 20&       : "+PF+"       |");
        System.out.println("|______________________________|");
        System.out.println("|Gross Salary    = "+grossSalary+"      |");
        System.out.println("|==============================|");
    }

}
