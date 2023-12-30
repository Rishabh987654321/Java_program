package problemsOnLoops;

import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {


        /*
         *
         ***
         *****
         *******

         */


        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            //printing spaces(row-i)
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            //printing stars(2*i-1)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //another method


//        int i, j, row = 6;
//            //Outer loop work for rows
//        for (i = 0; i < row; i++) {
//           //inner loop work for space
//            for (j = row - i; j > 1; j--) {
//              //prints space between two stars
//                System.out.print(" ");
//            }
//                  //inner loop for columns
//            for (j = 0; j <= i; j++) {
//                 //prints star
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


    }
}
