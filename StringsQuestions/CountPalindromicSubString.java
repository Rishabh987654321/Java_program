package StringsQuestions;

public class CountPalindromicSubString {
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="naman";
        int count=0;
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                if (isPalindrome(str.substring(i, j))){
                    System.out.println(str.substring(i,j));
                    count++;
                }
            }
        }
        System.out.println("the number of palindromic substring are "+count);

    }
}
