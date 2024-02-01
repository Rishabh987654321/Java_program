package recursion;

public class findElementExistOrNot {
    static boolean ElementExistInArray(int[] arr,int target,int idx){
        //base case --> if the array is traversed and element is not present i.e. idx is greater than or equal to len of array
        if (idx>arr.length-1){
            return false;
        }
        //self work
        if(arr[idx]==target){
            return true;
        }
       //recursive work
        return ElementExistInArray(arr,target,idx+1);
    }
    //return -1 if element not present else return the index of the element
    static int search(int[] arr,int target,int idx){
        if (idx>arr.length-1){
            return -1;
        }
        if (arr[idx]==target){
            return idx;
        }
        return search(arr,target,idx+1);
    }
    public static void main(String[] args) {

        int[] arr={2,5,6,8,3,4};
        int target=8;
//        if (ElementExistInArray(arr,target,0)){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }

        System.out.println(search(arr,target,0));
    }
}
