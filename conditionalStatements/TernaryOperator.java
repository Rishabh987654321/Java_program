package conditionalStatements;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 20;
        String result = (a % 2 == 0) ? "even" : "odd";

        System.out.println(result);//even
    }
}
