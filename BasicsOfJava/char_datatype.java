package BasicsOfJava;

import java.util.Scanner;

public class char_datatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);//to take input a char from user we use this method....the next() method is used to get the string and charAt is used to get char at any position
        System.out.println(ch);
    }
}
