package StringsQuestions;
import java.util.Scanner;
public class upperCaseToLowerUsingString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(str);
        for (int i=0;i<str.length();i++) {
            boolean flag = true;
            char currChar = str.charAt(i);
            if (currChar == ' ') continue;
            int ascii = (int) currChar;
            if (ascii >= 97) {//means it is a uppercase char
                flag = false;
            }
            if (flag == true) {
                ascii += 32;
                char ch = (char) ascii;
                str = str.substring(0, i) + ch + str.substring(i + 1);
            } else {
                ascii -= 32;
                char ch = (char) ascii;
                str = str.substring(0, i) + ch + str.substring(i + 1);

            }
        }
        System.out.println(str);
    }
}
