package ArrayList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        //syntax of array list
        ArrayList<Integer> list = new ArrayList<>();
        //common methods of ArrayList

        //add an element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //.add method adds the element at the end of the list
        System.out.println(list);

        //get an element at any index
        System.out.println(list.get(1));//.get method is used to access element of list at any index

        //printing all the element of array list using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //print the array list directly
        System.out.println(list);

        //adding element at any particular index in the list
        list.add(1, 0);
        System.out.println(list);//it takes two parameters the first is the position where we have to add and the second is the value that we have to add

        //changing the existing value at any index of list
        list.set(2, 5);
        System.out.println(list);//first parameter : takes index    second param:takes the value we have to set

        //removing an element at any index
        list.remove(4);
        System.out.println(list);

        //remove an element from the list without giving the index
        System.out.println(list.remove(Integer.valueOf(6)));
        System.out.println(list.remove(Integer.valueOf(16)));//if the element does not exist in the list it returns a boolean depending on weather it exists in the list or not
        System.out.println(list);

        //checking if an element exists in the list or not
        System.out.println(list.contains(5));

        //creating a Array list without any defined data type , it contains any data type we want
        ArrayList<Object> randomList = new ArrayList<>();
        randomList.add("p");
        randomList.add(1);
        randomList.add(true);
        System.out.println(randomList);

    }
}
