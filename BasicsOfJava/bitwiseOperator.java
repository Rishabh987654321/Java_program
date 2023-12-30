package BasicsOfJava;

public class bitwiseOperator {
    public static void main(String[] args) {
        int p = 9, q = 10;

        //bitwise or
        System.out.println(p | q);

        //bitwise and
        System.out.println(p & q);

        //bitwise xor(or)
        System.out.println(p ^ q);

        //bitwise not
        System.out.println(~p);

        //left shift p one time
        System.out.println(p << 1);
        //left shift p two time
        System.out.println(p << 2);

        //right shift p one time
        System.out.println(p >> 1);
        //right shift p two times
        System.out.println(p >> 2);

    }
}
