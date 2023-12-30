package problemsOnLoops;

import java.util.Scanner;

public class NumericaLPyramid {
    public static void main(String[] args) {
        /*

             1
            222
           33333
          44444444

         */


        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            //printing spaces(row-i)
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= i; k++) {
                if ((i + k) % 5 == 0) {
                    System.out.print(i);
                }

            }
            for (int k = 2; k <= i; k++) {
                System.out.print(i);
            }


            System.out.println();
        }

    }
}
