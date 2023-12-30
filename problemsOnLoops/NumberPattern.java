package problemsOnLoops;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {

        /*

        121212
        212121
        121212
        212121

         */


        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("2");
                }
            }
            System.out.println();
        }

    }
}
