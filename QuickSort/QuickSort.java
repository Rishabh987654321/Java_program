package QuickSort;

public class QuickSort {

    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static int partition(int[] arr, int start, int end){
        //choose pivot
        int pivot=arr[start];
        int elementLessThanPivotCounter=0;//counts the number that are less than pivot which gives the index of pivot element
        for(int i=start+1;i<=end;i++){
            if(arr[i]<=pivot){
                elementLessThanPivotCounter++;
            }

        }
        int pivotIndex=start+elementLessThanPivotCounter;//finding the correct position for pivot in array
        swap(arr,start,pivotIndex);

        int i=start,j=end;
        while (i<pivotIndex&&j>pivotIndex){
            while (arr[i]<=pivot) i++;
            while (arr[j]>pivot) j--;

            if(i<pivotIndex&&j>pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }


        return pivotIndex;
    }


    static void sort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int pivotElementIndex=partition(arr,start,end);
        sort(arr,start,pivotElementIndex-1);
        sort(arr,pivotElementIndex+1,end);
    }
    public static void main(String[] args) {
        int[] arr={6,8,9,20,2,1,8};
        sort(arr,0,arr.length-1);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
