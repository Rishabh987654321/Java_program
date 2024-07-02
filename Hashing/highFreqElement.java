package Hashing;

import java.util.Scanner;

public class highFreqElement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        //taking input of each element in the array
        System.out.println("Enter each elements of the array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //printing the elements of the array
        System.out.println("The elements of the array are : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        //pre compute
        int[] hash=new int[13];
        for (int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        int highfreqEle=0;

        for(int i=0; i<hash.length;i++){
            if(hash[i]>highfreqEle){
                highfreqEle=i;
            }
        }
        System.out.println("Highest frequency element is: "+highfreqEle);

    }
}
