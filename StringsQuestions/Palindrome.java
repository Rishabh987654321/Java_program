package StringsQuestions;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int i=0;
        int j=str.length()-1;
        boolean flag =true;

        while(i<j){

            if(str.charAt(i)!=str.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if (flag==true) System.out.println("palindrome");
        else System.out.println("not a palindrome");
    }
}
