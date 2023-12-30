package conditionalStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter an operator to perform operation");
            char operator = sc.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.println("enter two number to perform operation");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (operator == '+') {
                    ans = num1 + num2;
                }
                if (operator == '-') {
                    ans = num1 - num2;
                }
                if (operator == '*') {
                    ans = num1 * num2;
                }
                if (operator == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (operator == '%') {
                    ans = num1 % num2;
                }

            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }
    }
}
