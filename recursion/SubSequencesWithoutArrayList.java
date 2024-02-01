package recursion;

public class SubSequencesWithoutArrayList {
/*
String ="abc"
*/
    static void printSubsequence(String str,String currAns){//initially current ans is empty string

        //base case
        if (str.isEmpty()){
            System.out.println(currAns);
            return;
        }
        char currChar=str.charAt(0);//a
        String remString=str.substring(1);//bc

        //curchar chooses to be part of ans
        printSubsequence(remString,currAns+currChar);//(bc,""+a)

        //curchar chooses not to be part of ans
        printSubsequence(remString,currAns);//(bc," ")
    }
    public static void main(String[] args) {

        printSubsequence("abc","");
    }
}
