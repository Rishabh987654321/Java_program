package conditionalStatements;

import java.util.Scanner;

public class FindingGreatestInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three positive integer");
        System.out.println("enter the first integer");
        int a = sc.nextInt();
        System.out.println("enter second integer");
        int b = sc.nextInt();
        System.out.println("enter third integer");
        int c = sc.nextInt();
//        if(a>b&&a>c){
//            System.out.println("the greatest number is "+a);
//        } else if (b>a&&b>c) {
//            System.out.println("the greatest number is "+b);
//        }else {
//            System.out.println("the greatest number is "+c);
//        }


        //another approach without logical and operator
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is largest");
            } else {
                System.out.println(c + " is the largest");
            }
        } else {// else here means a<b
            if (b > c) {
                System.out.println(b + " is the largest");
            } else {
                System.out.println(c + " is the largest");
            }
        }
    }
}
