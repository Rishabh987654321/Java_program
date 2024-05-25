package StringsQuestions;

import java.util.Scanner;

public class UpperCaseToLowerCase {
    //convert all upper case char to lower case and all lower case char to upper case
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        System.out.println(str);
        for (int i=0;i<str.length();i++){
            boolean flag=true;
            char currChar=str.charAt(i);
            if (currChar==' ') continue;
            int ascii=(int)currChar;
            if (ascii>=97){//means it is a uppercase char
                flag=false;
            }
            if (flag==true){
                ascii+=32;
                char ch=(char)ascii;
                str.setCharAt(i,ch);
            }else{
                ascii-=32;
                char ch=(char)ascii;
                str.setCharAt(i,ch);
            }

        }
        System.out.println(str);

    }
}
