package problemsOnLoops;

public class SumOfGivenDigitsInNum {
    public static void main(String[] args) {
        int n = 1234;
        int ans = 0;
        int digit;
        //any num%10 gives the last digit of that number
        while (n > 0) {
            //finds the last digit of the given number
            digit = n % 10;
            //adds last digit to the variable sum
            ans = ans + digit;
            //removes the last digit from the number
            n = n / 10;
        }
        System.out.println(ans);
    }
}
