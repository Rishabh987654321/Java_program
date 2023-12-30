package conditionalStatements;

import java.util.Scanner;

public class Finding3digitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a positive number");
        int num = sc.nextInt();
        if (num > 99 && num < 1000) {
            System.out.println("its a three digit number");
        } else {
            System.out.println("it is not a three digit number");
        }
    }
}
