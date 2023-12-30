package problemsOnLoops;

import java.util.Scanner;

public class hollowNumericalRectangle {
    public static void main(String[] args) {

        /*
        123456
        1    6
        1    6
        1    6
        123456

         */

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
