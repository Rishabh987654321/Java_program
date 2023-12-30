package BasicsOfJava;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.next();//this method only print the first string
        System.out.println("The name is " + name);
        System.out.println("string");
        System.out.println(sc.nextLine());// this method will print the whole string


    }
}
