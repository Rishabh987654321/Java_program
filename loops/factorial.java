package loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  which you want factorial");
        int num = sc.nextInt();
        //the below code is to print factorial of a given number input by user
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println(fact);


        //the below code is to find factorial upto n numbers input by user
//        int fact=1;
//        for (int i=1;i<=num;i++){
//            fact=fact*i;
//            System.out.println("The factorial of "+i+" is "+fact);
//        }


    }
}
