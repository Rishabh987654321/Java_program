package loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int original_num = sc.nextInt();
        int num = original_num;
        for (int i = 1; i <= 10; i++) {
            num *= i;
            System.out.printf("%d * %d = %d", original_num, i, original_num * i);
            System.out.println();
        }


        //another method
//        int n=5;
//        for (int i=1;i<=10;i++){
//            System.out.printf("%d *%d = %d",n,i,n*i);
//            System.out.println();
//        }


    }
}
