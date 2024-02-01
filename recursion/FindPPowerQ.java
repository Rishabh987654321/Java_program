package recursion;

import java.util.Scanner;

public class FindPPowerQ {
    static int pow(int p, int q) {
        if (q == 0) {
            return 1;
        }
        return pow(p, q - 1) * p;
    }

    static int power(int p, int q) {
        if (q == 0) {
            return 1;
        }
        if (q % 2 == 0) {
//            int smallPow=power(p,q/2);
//            return smallPow*smallPow; //use this code to avoid calling method multiple time as it increase time complexity
            return power(p, q / 2) * power(p, q / 2);
        } else {
//            int smallPow=power(p,q/2);
//            return smallPow*smallPow*p;
            return power(p, q / 2) * pow(p, q / 2) * p;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(power(p, q));
    }
}
