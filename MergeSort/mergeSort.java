package MergeSort;

public class mergeSort {
    static void Sort(int[] arr,int left,int right){//func to sort the two divided array
        if(left>=right){
            return;
        }
        int mid =(left+right)/2;
        Sort(arr,left,mid);
        Sort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    static void merge(int[] arr,int left,int mid ,int right){//function to merge the two sorted array
        int n1=mid-left+1;
        int n2=right-mid;
        int[] leftArr=new int[n1];
        int[] rightArr=new int[n2];
        int i,j,k;
        for (i=0;i<n1;i++) leftArr[i]=arr[left+i];//filling the left sorted array to left array
        for (j=0;j<n2;j++) rightArr[j]=arr[mid+1+j];
        i=0;
        j=0;
        k=left;
        while (i<n1&&j<n2){
            if(leftArr[i]<=rightArr[j]){
                arr[k++]=leftArr[i++];
            }else{
                arr[k++]=rightArr[j++];
            }
        }
        while(i<n1){
            arr[k++]=leftArr[i++];
        }
        while (j<n2){
            arr[k++]=rightArr[j++];
        }


    }

    static void displayArr(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={4,6,3,2,11,45,9};
        int n=arr.length;
        System.out.println("Array before sorting");
        displayArr(arr);
        Sort(arr,0,n-1);
        System.out.println();
        System.out.println("Array after sorting");
        displayArr(arr);

    }
}
