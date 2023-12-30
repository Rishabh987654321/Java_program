package conditionalStatements;

import java.util.Scanner;

public class EnhancedSwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruits = sc.next();
        switch (fruits) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Lots of iron");
            case "Cherries" -> System.out.println("love fatii's cherry");
            default -> System.out.println("Mf write a valid fruit name");
        }
        //break statement not required here ...we can imagine that break is present at the end of very statement


        //another example
        int day = sc.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 ->
                    System.out.println("weekdaays");//if we give any input between, 1 to 5 it will give weekdays
            case 6, 7 -> System.out.println("weekends");//if we give 6 and 7 value it will give weekends
            default -> System.out.println("invalid");
        }
    }
}
