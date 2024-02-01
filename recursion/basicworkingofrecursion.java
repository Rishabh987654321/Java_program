package recursion;

public class basicworkingofrecursion {
    static void message(){
        System.out.println("helo");
        message1();
    }
    static void message1(){
        System.out.println("helo");
        message2();
    }
    static void message2(){
        System.out.println("helo");
        message3();
    }
    static void message3(){
        System.out.println("helo");
        message4();
    }
    static void message4(){
        System.out.println("helo");
    }
    public static void main(String[] args) {
        message();
    }
}
