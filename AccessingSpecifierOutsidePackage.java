import RepresentationOfAccessSpecifier.App;

//trying to access member variable that is public in another package
public class AccessingSpecifierOutsidePackage {

    public static void main(String[] args) {
        App obj = new App();
        System.out.println("outside package,non child class " + obj.str_1);

        App3 obj1 = new App3();
        obj1.printFromChildClass();
    }
}


// creating a child class and inheriting its parents properties

class App3 extends App {//App3 is a child class of class App(App3 inherits the properties of App...this is called inheritance)

    void printFromChildClass() {
        App3 obj = new App3();
        System.out.println("outside package, child class: " + obj.str_1);
    }

}