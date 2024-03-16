package ProblemsOnSorting2.java;

public class PrintAllNegativeNumThenPositive {
    //its not necessary that all the elements should be sorted only the negative number should be on left and positive on right
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void partiton(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            while(arr[left]<0){
                left++;
            }
            while (arr[right]>=0){
                right--;
            }
            if(left<right) {
                if (arr[left] > 0 && arr[right] < 0) swap(arr, left, right);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={19,-20,7,-4,-13,11,-5,3};
        partiton(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
