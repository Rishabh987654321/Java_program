package QuickSort;

public class AnotherMethodQuickSort {
    //function to give the pivot index
    static int partition(int[] arr,int low,int high){
        int pivot=arr[high];//taking last element as pivot
        int i=low-1;//i gives how many elements are smaller than pivot-->we are assuming that no element is smaller tha pivot for now
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){//if element less than pivot increment i  and swap element at i and j
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;//increment i so that it goes to the exact position of pivot and swap element at i with pivot element

        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;//pivot index
    }
    static void QuickSort(int[] arr,int low,int high){
        if(low<=high){
            int pivotIdx=partition(arr,low,high);
            QuickSort(arr,low,pivotIdx-1);
            QuickSort(arr,pivotIdx+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8};
        int n=arr.length;
        QuickSort(arr,0,n-1);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
