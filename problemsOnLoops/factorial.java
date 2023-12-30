package problemsOnLoops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //the below code is to find factorial of a given number

//        int num=sc.nextInt();
//        int fact=1;
//
//        while (num>0){
//            fact*=num;
//            num--;
//        }
//        System.out.println(fact);


        //the below code is to find factorial upto n numbers input by user

        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
            System.out.println("the factorial of " + i + " is " + fact);
        }
    }
}
