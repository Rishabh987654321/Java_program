package Strings;

public class strEquals {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");


        System.out.println(s1==s2);//true as the == operator compares char in string and there address also
        System.out.println(s1==s3);//fase
        System.out.println(s1.equals(s3));//.equals() method only compare the string char of two strings


        String str="hello";
        //str.charAt(0)='a'; this will give error as strings are immutable in java
    }
}
