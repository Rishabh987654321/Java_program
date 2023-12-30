package recursion;

import java.util.Scanner;

public class countNumberOfDigits {
    static int COD(int n) {

        if (n >= 0 && n <= 9) {
            return 1;
        }
        return COD(n / 10) + 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(COD(n));
    }

}
