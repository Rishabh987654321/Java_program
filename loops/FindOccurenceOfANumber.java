package loops;

import java.util.Scanner;

public class FindOccurenceOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num >= 1) {
            if (num % 10 == 7) {
                count++;

            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
