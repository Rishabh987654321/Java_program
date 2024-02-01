package recursion;

import java.util.Scanner;

public class factorial {
    static int fact(int n) {
        //base case
        if (n == 0) {
            return 1;
        }
        //self work / recursive case
        return n * fact(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
