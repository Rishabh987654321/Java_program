package recursion;

public class reverseString {

    static String reverse(String str,int idx){
        //base case
        if(idx==str.length()){
            return "";
        }
        //recursive case
        String smallAns=reverse(str,idx+1);
        //self work
        return smallAns+str.charAt(idx);

    }

    //another method
    static String reverse2(String str){
        if(str.isEmpty()){
            return "";
        }
        String smallAns=reverse2(str.substring(1));
        return smallAns+str.charAt(0);
    }

    public static void main(String[] args) {
        String str="abcde ew";
        System.out.println(reverse(str,0));
        System.out.println(reverse2(str));
    }
}
