package problemsOnLoops;

public class reverseTheDigits {
    public static void main(String[] args) {
        int n = 54321;
        int rev_num = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;//finding the remainder
            rev_num = rev_num * 10 + rem;//adding the remainder to rev number multiplied by 10  0*10+5,5*10+4,54*10+3....
            n = n / 10;//removing the last digit of n
        }
        System.out.println(rev_num);
    }
}
