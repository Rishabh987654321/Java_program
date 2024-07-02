package Hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countFrequenciesUsingHashMap {
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
        System.out.println();

        //precompute
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        //the map store the value in sorted order.... we can see this from the below traversing
        System.out.println("The elements in the map are: ");
        for (Map.Entry<Integer,Integer> e: map.entrySet()){
            System.out.println("Key: "+e.getKey() +" value: "+e.getValue());
        }

        //taking number of queries
        System.out.println("Enter number of queries");
        int q=sc.nextInt();
        while(q>0){
            int number=sc.nextInt();
            //fetch
            if (map.containsKey(number)){
                System.out.println("Frequency of "+number+ " is "+map.get(number));
            }else{
                System.out.println("Frequency of "+number+ " is 0");
            }
            q--;
        }
    }
}
