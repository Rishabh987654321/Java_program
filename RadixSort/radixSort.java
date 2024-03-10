package RadixSort;

public class radixSort {
    static int findMaxElement(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void countSort(int[] arr,int place){
        int n=arr.length;
        int[] ans=new int[n];
        //count array
        int[] countArr=new int[10];      
        //count the frequency of each element and put it into countArr
        for (int i=0;i<n;i++){
            countArr[(arr[i]/place)%10]++;
        }
        //make prefixsum  of count arr
        for (int i=1;i<countArr.length;i++){
            countArr[i]+=countArr[i-1];
        }
        //traverse from the last in original array and find the right index of each element in ans array
        for (int i=n-1;i>=0;i--){
            int idx=countArr[(arr[i]/place)%10]-1;
            ans[idx]=arr[i];
            countArr[(arr[i]/place)%10]--;
        }
        //copy all the element from ans array to the original array
        for (int i=0;i<n;i++){
            arr[i]=ans[i];
        }

    }
    static void radixSort(int[] arr){
        int max=findMaxElement(arr);
        //apply count sort to sort the elements based on their place value
        for (int place=1;max/place>0;place*=10){
            countSort(arr,place);
        }
    }


    public static void main(String[] args) {
        int[] arr={170,45,75,90,802,2};
        radixSort(arr);
        for (int val:arr){
            System.out.print(val+" ");
        }
    }
}
