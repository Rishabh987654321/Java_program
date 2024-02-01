package recursion;

import java.util.ArrayList;

public class findAllIndicesOfTargetElement {
    //given an array of size N find all the  indices of target element and return them
    static void findIndices(int[] arr,int target,int idx){

        if (idx>arr.length-1){
             return;
        }
        if(arr[idx]==target){
            System.out.print(idx+" ");
        }
        findIndices(arr,target,idx+1);
    }

    //using another method that uses arraylist to return
    static ArrayList<Integer> FindAllIndices(int[] arr,int target,int idx){
        ArrayList<Integer> ans=new ArrayList<>();
        if(idx>arr.length-1){
            return ans;//returns empty arrayList
        }
        if(target==arr[idx]){
             ans.add(idx);//add the idx to the arraylist
        }
        ArrayList<Integer> smallAns= FindAllIndices(arr,target,idx+1);
        ans.addAll(smallAns);//addAll method will add all the element of smallAns to ans
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,2,5};
        //findIndices(arr,2,0);
        ArrayList<Integer> ans=FindAllIndices(arr,2,0);
        for(Integer i:ans){
            System.out.print(i+" ");
        }
    }
}
