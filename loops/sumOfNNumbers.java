package loops;

import java.util.Scanner;

public class sumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number till where you have to sum it");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum = i + sum;
            i++;

        }
        System.out.println(sum);
    }
}
