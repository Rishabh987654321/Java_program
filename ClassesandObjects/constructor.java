package ClassesandObjects;

public class constructor {
    public static void main(String[] args) {

        algebra obj = new algebra(5, 7);//creating object of algebra class...(algebra(); is a constructor here
        System.out.println(obj.sum());
        System.out.println(obj.sub());

        algebra obj2 = new algebra(9, 10);///creating another object of class algebra
        System.out.println(obj2.sum());
        System.out.println(obj2.sub());

    }

}

class algebra {//creating a class algebra

    int a;//creating a class variable
    int b;

    algebra(int x, int y) {//creating a constructor of class algebra(A constructor is basically a method which is called when we create an object of this class)
        System.out.println("Constructor of class algebra called");
        a = x;//making the class variable equal to argument in constructor so that we can pass the value of a and b as x and y when object is created
        b = y;

    }

    int sum() {//creating a method of class algebra
        return a + b;
    }

    int sub() {//creating another method of class algebra
        return a - b;
    }


}
