package problemsOnLoops;

import java.util.Scanner;

public class SumOfFollowingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1-2+3-4+5-6....n.....we have to subtract if the num is even and add if it is odd
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans -= i;
            } else {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
