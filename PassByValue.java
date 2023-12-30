public class PassByValue {
    //java only supports pass by value
    static void changeValue(int a) {
        a *= 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        changeValue(a);
        System.out.println(a);

    }
}
