package ClassesandObjects;

class Student {
    int rollNo;
    String name;
}

public class Main {
    public static void main(String[] args) {

        Student obj1 = new Student();
        obj1.rollNo = 1;//initialising roll no for obj1
        obj1.name = "Rohan";//initialising name for obj1

        Student obj2 = new Student();
        obj2.rollNo = 2;
        obj2.name = "Rahul";


        System.out.println(obj1.rollNo);// ( gives 0 if  rollNo is not initialised so default value for int is 0)
        System.out.println(obj1.name);

        System.out.println(obj2.rollNo);
        System.out.println(obj2.name);// (gives null if value for String is not initialised, so default value for string is null)

    }
}
