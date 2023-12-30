package loops;

import java.util.Scanner;

public class SumOfNEvenNumber {
    public static void main(String[] args) {
        //sum of n even number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);


        //another method

        for (int i = 0; i < n; i++) {
            sum = sum + (2 * i);
        }
        System.out.println(sum);
    }
}
