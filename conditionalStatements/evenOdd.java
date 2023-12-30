package conditionalStatements;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        }
        if (num % 2 != 0) {
            System.out.println("odd");
        }
    }
}
