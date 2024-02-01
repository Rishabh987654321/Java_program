package recursion;

public class checkIntegerPalindrome {
    static int reverse(int num){
        int rev_num=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            rev_num=rev_num*10+rem;
        }
        return rev_num;
    }

    //another method
    static boolean isPalindrome(int num){
        //converting the number to string
        String numStr=Integer.toString(num);
        //calling the helper function to check if the number is palindrome
        return isPalindromeHelper(numStr,0,numStr.length()-1);
    }

    private static boolean isPalindromeHelper(String str,int left,int right) {
        //base case-- if the left index became higher than right index that means we have traversed the whole string
        if(left>=right){
            return true;
        }

        return str.charAt(left)==str.charAt(right)&&isPalindromeHelper(str,left+1,right-1);
    }

    public static void main(String[] args) {
        int num=121;
        int ans=reverse(num);
        if(num==ans){
            System.out.println("is palindrome");
        }else{
            System.out.println("not palindrome");
        }
        System.out.println(isPalindrome(num));
    }
}
