package BasicsOfJava;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int x = sc.nextInt();
        boolean isPrime = true;

        if (x <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
