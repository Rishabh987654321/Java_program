package recursion;

import java.util.Scanner;

public class checkArmstrongNumber {
    static int checkArmstrong(int n) {
        //base case
        if (n >= 0 && n <= 9) {
            return n * n * n;
        }
        int smallAns = n % 10;

        return checkArmstrong(n / 10) + smallAns * smallAns * smallAns;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = checkArmstrong(n);
        if (check == n) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }

}
