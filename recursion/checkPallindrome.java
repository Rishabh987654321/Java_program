package recursion;

public class checkPallindrome {
    //to check if the string is palindrome or not we can first reverse the string and check with the original string
    static String reverse( String str){
        if(str.isEmpty()) return "";
        String smallAns=reverse(str.substring(1));
        return smallAns+str.charAt(0);
    }

    static boolean palindrome(String str,int left,int right){
        //base case
        if(left>=right){
            return true;
        }
        return str.charAt(left)==str.charAt(right) && palindrome(str,left+1,right-1);
    }
    public static void main(String[] args) {
        String str = "level level";
        String ans = reverse(str);
        if (ans.equals(str)) {
            System.out.printf("%s Is palindrome",str);
        } else {
            System.out.printf("%s is not palindrome",str);
        }
        System.out.println();
        System.out.println(palindrome(str,0,str.length()-1));
    }
}
