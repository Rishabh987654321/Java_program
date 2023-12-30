package conditionalStatements;

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer");
        int n = sc.nextInt();
        if (n < 0) {
            n *= -1;
            System.out.println("Absolute value of given integer is " + n);
        } else {
            System.out.println("absolute value is " + n);
        }
    }
}
