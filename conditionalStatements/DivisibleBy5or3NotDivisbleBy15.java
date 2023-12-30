package conditionalStatements;

import java.util.Scanner;

public class DivisibleBy5or3NotDivisbleBy15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
//        if(num%5==0||num%3==0){
//            if(num%15!=0){
//                System.out.println(num+" is divisible by 5 or 3 but not divisible by 15");
//            }else {
//                System.out.println(num+" is divisible by 15");
//            }
//        }else {
//            System.out.println(num+" is divisible by 15");
//        }


        // using another approach
        if ((num % 5 == 0 || num % 3 == 0) && num % 15 != 0) {
            System.out.println(num + " is divisible by 5 or 3 but not divisible by 15");
        } else {
            System.out.println(num + " is divisible by 15");
        }
    }
}
