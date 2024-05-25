package StringsQuestions;
//input-- aaabbbbccddde output-- a3b4c2d3e
public class StringCompression {
    public static void main(String[] args) {
        String str="aaabbbbccdddeee";
        String ans=""+str.charAt(0);
        int count=1;
        for (int i=1;i<str.length();i++){
            char currChar=str.charAt(i);
            char prevChar=str.charAt(i-1);
            if (currChar==prevChar){
                count++;
            }else{
                if(count>1) ans+=count;
                count=1;
                ans+=currChar;
            }
        }
        if(count>1) ans+=count;
        System.out.println(ans);

    }
}
