package conditionalStatements;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want the day of:");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid day");
        }


        ///rules :
        //cases should have same type as the type of expression given in switch
        //duplicate cases value are not accepted
        //if break is not used it will print all the statement from where it gets the input(suppose it gets 3 as input it will print all the day name starting from 3 to default)


    }
}
