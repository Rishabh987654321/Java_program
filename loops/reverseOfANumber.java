package loops;

public class reverseOfANumber {
    public static void main(String[] args) {
        int num = 12345;
        int rev_num = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            rev_num = rev_num * 10 + rem;
        }
        System.out.println(rev_num);
    }
}
