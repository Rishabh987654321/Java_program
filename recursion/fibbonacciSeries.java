package recursion;

import java.util.Scanner;

public class fibbonacciSeries {
    static int printFibbonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return printFibbonacci(n - 1) + printFibbonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(printFibbonacci(i) + " ");
        }
    }
}
