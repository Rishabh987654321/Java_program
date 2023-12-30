package problemsOnLoops;

import java.util.Scanner;

public class NumericalRectangularPattern {
    public static void main(String[] args) {

        /*

        1234567
        2345671
        3456712
        4567123
        5671234
        6712345
        7123456

         */


        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
