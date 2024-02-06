package Bubble_Sort;

public class bubbleSort {
    static void BubbleSort(int[] arr){
        int n=arr.length;
        boolean flag=false;//to check if any swap has occurred or not at any passes
        for(int i=0;i<n-1;i++){//for n number of elements we have to run loop n-1 times
            for (int j=0;j<n-i-1;j++){//last i-1 elements are already at sorted positions so, we don't need to check them
                if (arr[j]>arr[j+1]){//swap
                    flag=true;//shows that some swap has happened
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(flag==false){//check if swap has happened or not if not means that array is sorted and return no need to check for rest of passes
                return;
            }
        }
    }
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap them if they are in the wrong order
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={7,6,5,4,3};
        BubbleSort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        bubbleSortDescending(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }

    }
}
