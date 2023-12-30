package loops;

import java.util.Scanner;

public class greatestCommonDivisor {
    //approach 1
    static int GCD(int x, int y) {
        int minValue = Math.min(x, y);
        int ans = 0;
        for (int i = minValue; i >= 1; i--) {
            if (x % i == 0 && y % i == 0 && ans <= i) {
                ans = i;
            }
        }
        return ans;
    }

    //approach 2
    static int GCD2(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;

        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(GCD(x, y));
        System.out.println(GCD2(x, y));
    }
}
