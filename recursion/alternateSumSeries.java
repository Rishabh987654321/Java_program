package recursion;

public class alternateSumSeries {
    static int alternateSum(int n) {
        if (n == 0) {
            return 0;
        }
        int smallAns = alternateSum(n - 1);
        if (n % 2 == 0) {
            return smallAns - n;
        } else {
            return smallAns + n;
        }
    }

    public static void main(String[] args) {
        int ans = alternateSum(5);
        System.out.println(ans);
    }
}
