package conditionalStatements;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price of item");
        float cp = sc.nextFloat();
        System.out.println("enter the selling price of item");
        float sp = sc.nextFloat();
        if (sp > cp) {
            float profit = sp - cp;
            System.out.println("profit of " + profit);
        } else {
            float loss = cp - sp;
            System.out.println("you incurred a loss of " + loss);
        }
    }
}
