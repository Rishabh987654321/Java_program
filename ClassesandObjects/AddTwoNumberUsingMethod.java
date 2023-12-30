package ClassesandObjects;

import java.util.Scanner;

class AddTwoNum {// separate class named AddTwoNum with a method inside it

    public int sum(int a, int b) {//method named sum
        return a + b;
    }
}

public class AddTwoNumberUsingMethod {
    public static void main(String[] args) {
        AddTwoNum obj1 = new AddTwoNum();//creating an object of class AddTwoNum to call the method sum
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer");//taking two input from user
        int x = sc.nextInt();
        System.out.println("enter second integer");
        int y = sc.nextInt();
        System.out.println(obj1.sum(x, y));//calling the method sum with x and y as argument which is input by user
    }
}
