package ClassesandObjects;


public class Method { //class named method
    public static void welcome() {//method named welcome......static keyword means that we can call this method without creating an object
        System.out.println("hello welcome");
    }

    public static void main(String[] args) {
        welcome();//calling a method....we were able to call this method without creating an object because of the static keyword present in the method
    }

}
