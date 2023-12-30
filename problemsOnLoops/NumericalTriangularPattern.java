package problemsOnLoops;

import java.util.Scanner;

public class NumericalTriangularPattern {
    public static void main(String[] args) {

        /*

        1
        12
        123
        1234
        12345

         */


        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
