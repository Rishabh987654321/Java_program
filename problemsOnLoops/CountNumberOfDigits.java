package problemsOnLoops;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int num = 878766870;
        int count = 0;
        int original_num = num;
        while (num > 0) {
            num = num / 10;//we will store the divided num in num itself so that the divided value is remained in num after each divison
            //keep dividing num until its remainder is 0 and after each division increase the count by one
            count++;
        }
        System.out.println("Number of digits in " + original_num + " is " + count);
    }
}
