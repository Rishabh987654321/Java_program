package problemsOnLoops;

import java.util.Scanner;

public class oneToSixRectangularPattern {
    public static void main(String[] args) {

        /*

        123456
        123456
        123456
        123456

         */


        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
