package StringsQuestions;
import java.util.Scanner;
//input--i am ram   output-- i ma mar
public class reverseEachWordInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String ans="";
        StringBuilder gtr=new StringBuilder(" ");
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch!=' '){
                gtr.append(ch);//if the current char is not a space then append it into stringBuilder

            }else{
                gtr.reverse();//reverse the String present in StringBuilder and add it to ans String
                ans+=gtr;
                ans+=" ";//add space so that the next String is not attached to previous one
                gtr=new StringBuilder("");//destroy the string builder or empty it annd make a new string builder for each word
            }
        }
        gtr.reverse();//the last word of the string will be added to gtr but will not be reversed so we reverse it and add to the ans string
        ans+=gtr;
        System.out.println(ans);
    }
}
