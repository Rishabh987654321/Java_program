package QuickSort;

public class Anothermethod {

    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while (i<j){//as soon as i cross j we have to swap original pivot to arr[j] so condition will be i should be less than j to  keep iterating
            while(arr[i]<pivot&&i<=high){//if the element at i is less than pivot i++ also i should b less than high
                i++;
            }
            while(arr[j]>pivot&&j>=low){
                j--;
            }
            if(i<j){//if i and j have not crossed yet swap and keep iterating further
                swap(arr,i,j);
            }
        }
        return j;//return pivot index because at last i is being swapped at j position which is correct pivot index
    }
    static void QuickSort(int[] arr,int low,int high){
        if(low<high){
            int partitionIndex=partition(arr,low,high);
            QuickSort(arr,low,partitionIndex-1);
            QuickSort(arr,partitionIndex+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr={4,6,2,5,7,9,1,3};
        QuickSort(arr,0,arr.length-1);
        for(int val:arr){
            System.out.print(val+" ");
        }

    }
}
