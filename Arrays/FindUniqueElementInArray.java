package Arrays;

public class FindUniqueElementInArray {

    static void uniqueElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
                System.out.println("unique element in the array are: " + arr[i]);
            }
        }

    }


    //another method(only for one unique element present in array)
//    static int uniqueElement(int[] arr){
//
//        for(int i=0;i<arr.length;i++){
//            int count=0;
//            for (int j=0;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;//increase the count if both the element are same
//                }
//            }
//            if (count==1){
//                return arr[i];//if count value is 1 means the element is occurring exactly once
//            }
//        }
//        return -1;//if no unique element found return -1
//    }

    public static void main(String[] args) {


        int[] arr = {1, 6, 3, 1, 3};
        uniqueElement(arr);
//        int ans=uniqueElement(arr);
//        System.out.println(ans);
    }
}
