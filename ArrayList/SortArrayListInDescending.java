package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListInDescending {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("original list : " + list);
        //to sort an array list we can simply use sort function in the collection class
        Collections.sort(list);//this will sort the liat in ascending order
        System.out.println("Ascending order sorted " + list);
        Collections.sort(list, Collections.reverseOrder());

        //array list of string
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Welcome");
        stringList.add("to");
        stringList.add("world");
        System.out.println(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);
    }
}
