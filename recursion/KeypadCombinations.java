package recursion;

public class KeypadCombinations {

    static void combinations(String digits,String[] keyValue,String currResult){
        if(digits.isEmpty()){
            System.out.print(currResult+" ");
            return;
        }
        int currNum=digits.charAt(0)-'0';//
        String currChoices=keyValue[currNum];
        for (int i=0;i<currChoices.length();i++){
            combinations(digits.substring(1),keyValue,currResult+currChoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s="23";
        String[] keyValue={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //                  0   1    2     3     4     5     6     7      8       9
        combinations(s,keyValue,"");

    }
}
