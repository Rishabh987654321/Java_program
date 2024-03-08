package CountSort;



public class countSort {
    //method to find the max elelement of array
    static int findMaxElement(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //this method is not a stable sorting method
    static void Sort(int[] arr){
        //find the maximum element of the array
        int max=findMaxElement(arr);
        int[] frequencyArr=new int[max+1];
        for(int i=0;i<arr.length;i++){
            frequencyArr[arr[i]]++;//will count the frequency of element and put it in frequencyarr
        }
        int k=0;//to ite
        for(int i=0;i<frequencyArr.length;i++){
            for (int j=0;j<frequencyArr[i];j++){
                arr[k++]=i;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4,3,1,5,3,1,3,5};
        Sort(arr);
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
}
