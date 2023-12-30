package BasicsOfJava;

public class Literals {
    public static void main(String[] args) {
        byte age = 90;
        int x = 7989600;
        long largeIntegers = 67787687990976000L;//by default the type is int so we write L to specify long
        short age1 = 6;
        char ch = 'a';//symbols like ! @ # $ % ^ & * ( ) { } [] | ? / \ ; : ' " . , < > + = ` ~ // 01234567789 also
        float f1 = 9.1f;
        double largeDecimalNumbers = 9.6;//by default decimal numbers are double in java
        String str = "hello";// this is not a primitive data type in java
        int a = 34_250_200;//underscore is used to write numbers that are in millions it is seen as comma while compiling
        System.out.println(a);
    }
}
