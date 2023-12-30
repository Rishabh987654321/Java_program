package conditionalStatements;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();

        if (a % 5 == 0) {
            if (a % 3 == 0) {
                System.out.println(a + " is divisible by 5 and 3 both");
            } else {
                System.out.println("not divisible");
            }
        } else {
            System.out.println("not divisible");
        }
    }
}
