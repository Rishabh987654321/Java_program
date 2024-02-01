package recursion;

import java.util.Scanner;

public class printNnaturalNumbers {
    static void printNNaturalNumbers(int n) {
        //base case
        if (n == 1) {
            System.out.print(n);
            return;
        }

        //recursive work
        printNNaturalNumbers(n - 1);
        //self work
        System.out.print(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNNaturalNumbers(n);
    }
}
