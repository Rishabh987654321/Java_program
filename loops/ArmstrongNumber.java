package loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int sumOfCube = 0;
        int digits;
        while (num != 0) {
            digits = num % 10;
            sumOfCube += (Math.pow(digits, 3));
            num /= 10;
        }
        if (sumOfCube == originalNum) {
            System.out.println("armstrong");
        } else
            System.out.println("not arrmstrong");
    }
}
