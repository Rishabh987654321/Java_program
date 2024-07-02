package Hashing;

import java.util.*;
public class CountFrequenciesOfCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking string as input from the user
        System.out.println("enter your string");
        String str=sc.next();
        System.out.println(str);
        // Precompute character frequencies
        int[] hash=new int[26];
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            hash[ch-'a']++;//we have assumed the string contains only lower case char
            //if the string contains only upper case char the do hash[ch- 'A']++
            //if the string contains mixture of both the take hash array size as 256 and simply do has[ch]++
        }

        //taking number of queries to solve
        System.out.println("enter number of queries");
        int q=sc.nextInt();
        System.out.println(q);
        while (q>0){
            char ch=sc.next().charAt(0);
            System.out.println(hash[ch-'a']);//in order to get the index we do char - a
            q--;
        }

    }
}
