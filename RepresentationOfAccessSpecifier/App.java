package RepresentationOfAccessSpecifier;

public class App {

    public String str_1 = "I am a public member and i can be accessed";//declaring a public member in the main class

    void printFromClass() {//creating a method
        System.out.println("Within the class " + str_1);
    }

    public static void main(String[] args) {
        App obj1 = new App();//creating an object of class App
        obj1.printFromClass();//calling the method through the object


        App2 obj2 = new App2();
        obj2.outsideClassSamePackage();

    }
}

class App2 {
    void outsideClassSamePackage() {
        App obj1 = new App();//creating object of app to access its variable in another class
        System.out.println("Within the same package but different class " + obj1.str_1);
    }
}
