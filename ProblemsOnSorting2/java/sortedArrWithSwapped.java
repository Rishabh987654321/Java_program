package ProblemsOnSorting2.java;
//3,8,6,7,5,9,10 --> 8 and 5 are swapped here unswap them in linear time
public class sortedArrWithSwapped {
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void sortArr(int[] arr){
        int n=arr.length;
        int x=-1,y=-1;
        if (n<=1){//if only one element is present then return 
            return;
        }
        for (int i=1;i<n;i++){
            if (arr[i-1]>arr[i]){
                if(x==-1){
                    x=i-1;
                    y=i;

                }else{
                    y=i;
                }
            }
        }
        swap(arr,x,y);
    }
    public static void main(String[] args) {
        int[] arr={3,8,6,7,5,9,10};
        sortArr(arr);
        for(int val:arr){
            System.out.print(val+ " ");
        }
    }
}
