package BucketSort.java;
import java.util.Collections;
import java.util.ArrayList;

public class bucketSort {
    static void Sort(float[] arr){
        int n= arr.length;
        //buckets creation
        ArrayList<Float>[] buckets=new ArrayList[n];
        //create empty buckets
        for (int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
        }
        //add elements in our bucket
        for (int i=0;i<n;i++){
            int bucketIndex=(int) arr[i]*n;
            buckets[bucketIndex].add(arr[i]);
        }
        //sort each bucket individually
        for (int i=0;i< buckets.length;i++){
            Collections.sort(buckets[i]);
        }
        //merge all the buckets to get final sorted array
        int idx=0;
        for (int i=0;i< buckets.length;i++){
            ArrayList<Float> currentBucket=buckets[i];
            for (int j=0;j<currentBucket.size();j++){
                arr[idx++]=currentBucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float[] arr={0.5f,0.4f,0.3f,0.2f,0.1f};
        Sort(arr);
        for (float val:arr){
            System.out.print(val+" ");
        }
    }
}
