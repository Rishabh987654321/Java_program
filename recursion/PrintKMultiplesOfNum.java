package recursion;

import java.util.Scanner;

public class PrintKMultiplesOfNum {
    static void printKmultiplesOfNum(int n, int k) {
        if (k == 0) {
            //we can also give k==1 as base case: if(k==1){sout(n)}return;
            return;
        }
        printKmultiplesOfNum(n, k - 1);
        System.out.print(n * k + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printKmultiplesOfNum(n, k);
    }
}
