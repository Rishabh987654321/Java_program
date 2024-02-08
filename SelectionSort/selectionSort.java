package SelectionSort;

public class selectionSort {

    static void SELECTIONSORT(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int minElementIndex=i;//let's assume that minimum element is at index 0
            for (int j=i+1;j<n;j++){//we will traverse from i+1 as the first index is the element that we are going to replace at right position
                if (arr[j]<arr[minElementIndex]){
                    minElementIndex=j;//if element at index j is less tha element at minimumElementindex then make it equal to j
                }
            }
            int temp=arr[i];
            arr[i]=arr[minElementIndex];
            arr[minElementIndex]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={7,4,5,3,1};
        SELECTIONSORT(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
