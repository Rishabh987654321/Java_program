package conditionalStatements;

import java.util.Scanner;

public class PrintLeastAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age of three people");
        int ram = sc.nextInt();
        int shyam = sc.nextInt();
        int raju = sc.nextInt();
//        if (a<b&&a<c){
//            System.out.println(a+" is the youngest");
//        } else if (b>a&&b>c) {
//            System.out.println(b+" is the youngest");
//        }else{
//            System.out.println(c+" is the youngest");
//        }

        if (ram < shyam) {
            if (ram < raju) {
                System.out.println("ram is the youngest");
            } else {
                System.out.println("raju is the youngest");
            }
        } else {// else here means ram is bigger than shyam(ram>shyam)
            if (shyam < raju) {
                System.out.println("shyam is the youngest");
            } else {
                System.out.println("raju is the youngest");
            }
        }
    }
}
