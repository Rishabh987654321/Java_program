package ClassesandObjects;

public class RepresentationOfStaticKeyword {


    static int a = 10;//initialising static variable which can be accessed by static method and non-static method both
    int b = 20;//initialising instance variable which can be accessed only by non-static methods

    void sampledisplay() {//method named sampledisplay
        System.out.println(a);//static variable a can be accessed by non-static method
        System.out.println(b);
    }

    static void staticDisplay() {//static method named staticdisplay
        System.out.println(a);
        //System.out.println(b);this will throw an error as we are trying to access a instance variable without creating an object
    }


    public static void main(String[] args) {
        RepresentationOfStaticKeyword obj1 = new RepresentationOfStaticKeyword();//creating object of class to access the method
        obj1.sampledisplay();//calling the non-static method
        staticDisplay();//calling the static method....we don't have to create an object in this case
    }
}
