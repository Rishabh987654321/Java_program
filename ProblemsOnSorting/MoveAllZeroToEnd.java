package ProblemsOnSorting;

public class MoveAllZeroToEnd {
    static void MoveZero(int[] arr){
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]==0&&arr[j+1]!=0){
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,5,0,3,4,2};
        MoveZero(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
