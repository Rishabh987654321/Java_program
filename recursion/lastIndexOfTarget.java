package recursion;

public class lastIndexOfTarget {
    //find the last index of the target

    static int lastIndex(int[] arr,int target,int idx){
        //base case
        if(idx>arr.length-1){//if the element is not present in the array,and we have traversed the whole array
            return -1;
        }
        //self work
        if(target==arr[idx]){ //checking if the last index is equal to target ... if it is then it is our last index
            return idx;
        }
        //recursive case
        return lastIndex(arr, target, idx - 1);//iterate from the last index till the first index
    }

    //another method
    static int findLastIndex(int[] arr,int target,int idx){
        //bse case (if the element is not present in the array, and we have traversed the whole array
        if(idx>=arr.length-1){
            return -1;
        }
        //recursive case
        //part 1 the array start from 1 to end and first element is not considered
        //part 2 the array start from 0 till end
        int part1=findLastIndex(arr,target,idx+1);
        if(part1!=-1){
            return part1;
        }else if (arr[idx]==target){
            return idx;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr={4,3,4,4,1};
        int lastIndex=lastIndex(arr,4,arr.length-1);//here we are searching from the end and the first occurrence of the target element is our answer
        System.out.println(lastIndex);
        int index=findLastIndex(arr,4,0);
        System.out.println(index);
    }
}
