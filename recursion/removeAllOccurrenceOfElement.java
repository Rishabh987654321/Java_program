package recursion;
import java.util.Scanner;
public class removeAllOccurrenceOfElement {
    static String RemoveOccurrence(String s,int idx){
        //base case: if index===str.len then return empty string
        if(idx==s.length()) return "";

        //recursive case
        String smallAns=RemoveOccurrence(s,idx+1);

        char currentChar=s.charAt(idx);
        //self work
        if (currentChar!='a'){
            return currentChar+smallAns;
        }else {
            return smallAns;
        }
    }
    static String Remove(String str,char target){
        if (str.isEmpty()){
            return "";
        }
        String smallAns=Remove(str.substring(1),target);
        char currentchar=str.charAt(0);
        if (currentchar==target){
            return smallAns;
        }
        return currentchar+smallAns;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(RemoveOccurrence(str,0));
        System.out.println(Remove(str,'a'));

    }
}
