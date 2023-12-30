package conditionalStatements;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter percentage");
        int p = sc.nextInt();

        //in else if statements wherever a condition is met true all the other conditions are ignored even though they are true
        if (p > 90) {
            System.out.println("excellent");
        } else if (p > 80) {
            System.out.println("very good");
        } else if (p > 70) {
            System.out.println("good");
        } else {
            System.out.println("fail");
        }
    }
}
