package loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of number till you have to print it");
        int num = sc.nextInt();
        int i = 1;
        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }
}
