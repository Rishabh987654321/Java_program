package Hashing;
import java.util.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;

public class DiffWaysOfTraversingHashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //creating an empty hash map of object string and integer type
        HashMap<String,Integer> map=new HashMap<>();

        //inserting elements into the hash map
        map.put("Maths",80);
        map.put("English",90);
        map.put("Physics",70);
        map.put("Chemistry",80);
        System.out.println("Elements of map are: "+map);

        System.out.println("Elements after adding bonus 10 marks");


        //1st way of traversing is using an Iterator
        //Getting an Iterator
//        Iterator<Entry<String, Integer>> hmIterator=map.entrySet().iterator();
//        while (hmIterator.hasNext()){
//            //adding bonus marks for each subject
//            Entry<String, Integer> mapElement= hmIterator.next();
//            int marks=mapElement.getValue()+10;
//            System.out.println(mapElement.getKey()+ ":" +marks);
//        }

        //2nd way using for each loop
        for (Map.Entry<String,Integer> mapElement:map.entrySet()){
            String key= mapElement.getKey();
            int value=mapElement.getValue()+10;
            System.out.println(key +":"+value);
        }

        //3rd way using forEach() method
        //map.forEach((k,v)-> System.out.println(k+" :"+(v+10)));





    }
}
