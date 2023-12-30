package NumberSystem;

import java.util.Scanner;

public class conversionBinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number to convert it into decimal number ");
        int binary_num = sc.nextInt();
        int ans = 0;
        int powerOfUnitDigit = 0;//2^0=1
        while (binary_num > 0) {
            int unit_digit = binary_num % 10;
            ans += unit_digit * Math.pow(2, powerOfUnitDigit);
            binary_num = binary_num / 10;
            powerOfUnitDigit++;

        }
        System.out.println("The decimal conversion is " + ans);
    }
}
