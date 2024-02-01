package recursion;

import java.util.ArrayList;
  /*
string="abc
ans--> [abc,ab,ac,a,bc,b,c," "]
  */
public class subSequencesOfstring {
    static ArrayList<String> getAllSubsequences(String str){
        //array list to store all the subsequences
        ArrayList<String> ans=new ArrayList<>();
        //base case
        if(str.isEmpty()){
            ans.add("");
            return ans;
        }
        //current char to add in front of some of the substring
        char currChar= str.charAt(0);
        //small_ans to store all the subsequences that don't have 'a' in it
        ArrayList<String> smallAns=getAllSubsequences(str.substring(1));//this will give all the subsequence of "bc"

        for(String s:smallAns){
            ans.add(s);//storing all the subsequences of small ans into final ans
            ans.add(currChar+s);//at last storing subsequences of smallans + currentchar to final ans
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans=getAllSubsequences("abc");
        for (String s:ans){
            System.out.println(s);
        }
    }
}
