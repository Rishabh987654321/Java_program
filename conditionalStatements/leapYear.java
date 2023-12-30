package conditionalStatements;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year");

        int year = sc.nextInt();
        if (year / 100 == 0 && year / 400 != 0) {
            System.out.println("its leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}
