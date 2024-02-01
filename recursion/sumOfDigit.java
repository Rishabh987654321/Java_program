package recursion;

import java.util.Scanner;

public class sumOfDigit {

    static int SumOfDigit(int n) {
        int sum = 0;
        if (n >= 0 && n <= 9) {
            return n;
        }
        sum = SumOfDigit(n / 10) + n % 10;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumOfDigit(n));
    }
}
