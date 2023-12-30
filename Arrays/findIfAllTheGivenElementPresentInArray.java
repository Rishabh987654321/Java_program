package Arrays;

import java.util.Scanner;

///here query are the elements that we have to find if they are present in the array or not
public class findIfAllTheGivenElementPresentInArray {

    static int[] frequencyArray(int[] arr) {
        int[] freq = new int[100005];//taking this size because the original array can not be greater than this
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]] = freq[arr[i]] + 1;//same as below only diff representation
            // freq[arr[i]]++;//initialy all the index in freq array is zero so we iterate thrugh original array and increase the frequency of each element by one in freq array
        }
        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // making a frequency array to store the frequency of each item present in original array
        int[] freq = frequencyArray(arr);
        System.out.println("Enter the number of queries you want to search");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter number to be searched");
            int x = sc.nextInt();
            if (x == -1) {
                break;
            }
            if (freq[x] > 0) {
                System.out.println("YES");//means the element is present in original array
            } else {
                System.out.println("NO");//else element is not present in the original array
            }
        }

    }
}
