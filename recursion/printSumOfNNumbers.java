package recursion;

import java.util.Scanner;

public class printSumOfNNumbers {

    static int printSum(int n) {
        if (n == 0) {
            return 0;
        }
        return printSum(n - 1) + n;
    }

    public static void main(String[] args) {

        int i = printSum(5);
        System.out.println(i);
    }
}
