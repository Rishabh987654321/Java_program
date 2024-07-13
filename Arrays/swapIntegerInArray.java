package Arrays;

public class swapIntegerInArray {

    //swapping using temporary variable
    static void swap(int a, int b) {
        System.out.println("Before swapping value of a is " + a + " and value of b is " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping value of a is " + a + " and value of b is " + b);

    }

    //Swapping using sum and subtract method
    static void swapUsingSumAndSub(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping value of a is " + a + " and value of b is " + b);
    }

    //swapping using division and multiplication
    static void swapUsingDivAndMultiply(int a, int b) {
        if (a != 0 || b != 0) {
            a = a * b;
            b = a / b;
            a = a / b;
            System.out.println("After swapping value of a is " + a + " and value of b is " + b);
        }
    }

    //swapping two number using Bitwise exclusive or(xor)
    static void swapUsingXOR(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping value of a is " + a + " and value of b is " + b);
    }

    public static void main(String[] args) {

        int a = 9;
        int b = 3;
        swap(a, b);
        swapUsingSumAndSub(a, b);
        swapUsingDivAndMultiply(a, b);
        swapUsingXOR(a, b);
    }
}
