package Hashing;

//importing the Hashmap class
import java.util.HashMap;
import java.util.Map;

public class hashMapBasic {
    //hash map is a part of java collection framework found in java.util package
    public static void main(String[] args) {

        //creating an empty hashmap by declaring object of string and integer type
        HashMap<String,Integer> map=new HashMap<>();

        //adding key value pair to the map using put() method
        map.put("Rishabh",98);
        map.put("Jatin",88);
        map.put("Harsh",78);
        //map.put("Jatin",89); // it will replace the key and its value associated with it as no duplicate keys are allowed

        //printing the size of map using size() method
        System.out.println("Size of the map is "+ map.size());

        //printing the elements of the map
        System.out.println(map);

        //to iterate the map using for each loop
        for (Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println("Key: "+e.getKey()+" value: "+ e.getValue());
        }

        System.out.println(map.containsKey("Jim"));
        // Output: false


        if (map.containsKey("Rishabh")){

            //mapping
            Integer a=map.get("Rishabh");
            System.out.println("value for key " + "Rishabh is:- " + a);
        }

        //to remove an element from the map
        map.remove("Rishabh");
        System.out.println(map);
    }
}
