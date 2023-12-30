package problemsOnLoops;

import java.util.Scanner;

public class aRaisedToPowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter the power that you want a to be raised");
        int b = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        System.out.println("A raised to the power of b is " + ans);

    }
}
