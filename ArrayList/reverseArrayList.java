package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList {

//    static void reversearrayList(ArrayList<Integer> list){
//        int i=0;
//        int j=list.size()-1;
//        while (i<j){
//            Integer temp=Integer.valueOf(list.get(i));
//            list.set(i, list.get(j));
//            list.set(j,temp);
//            i++;
//            j--;
//        }
//    }

    //another method
    //Using collection package that contains .reverse method that reverses an array list
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("original list : " + list);
        //reversearrayList(list);
        Collections.reverse(list);
        System.out.println("Reversed list : " + list);

    }
}
