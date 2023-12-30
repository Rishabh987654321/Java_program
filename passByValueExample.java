public class passByValueExample {

    static void decrease(int n1, int n2) {// a copy of p and q is made and stored at diff location, and then it is associated to n1 and n2
        n1--;
        n2 = n2 - 2;
        System.out.println(n1 + " : " + n2);//here the value of n1 and n2 only changes it doesn't affect the value of p and q
    }

    public static void main(String[] args) {
        int p = 10;
        int q = 15;
        decrease(p, q);
        System.out.println(p + " : " + q);//value of p and q remains unaffected
    }
}
