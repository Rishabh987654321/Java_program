package BasicsOfJava; //this is package used to group all the functions and classes.Think of it as a folder in a file directory

public class Basics { //this is a class that contain the main function
    public static void main(String[] args) {   //this is a default func used to run simple snippet code.The name is always main.

        int x = 5, y = 10, z = 8;
        System.out.println(x + y + z);// 23
        System.out.println("hello" + x + y + z);// hello5108
        System.out.println(x + y + "" + z);//158
        System.out.println(x + "" + y + z);//5108

    }
}
