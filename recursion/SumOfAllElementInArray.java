package recursion;
import java.util.Scanner;
public class SumOfAllElementInArray {
    static int sum(int[] arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        return sum(arr,index+1)+arr[index];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        int[] arr={1,2,3,45};
        System.out.println(sum(arr,index));
    }
}
