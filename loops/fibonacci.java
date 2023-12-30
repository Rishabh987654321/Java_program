package loops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want fibonacci series");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }


        //another method
        //finding nth fibonacci number

//        int first_num=0;
//        int second_num=1;
//
//        int count=2;
//        int n= sc.nextInt();//n is the nth value of fibonacci series that we have to find
//        while (count<=n){
//           int temp=second_num;
//           second_num=second_num+first_num;
//           first_num=temp;
//           count++;
//
//        }
//        System.out.println(second_num);


    }
}
