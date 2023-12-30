package conditionalStatements;

import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int len = sc.nextInt();
        System.out.println("enter the width");
        int width = sc.nextInt();
        int area = len * width;
        int perimeter = 2 * (len + width);
        if (area > perimeter) {
            System.out.println("areaA IS GREATER");
        } else if (area == perimeter) {
            System.out.println("perimeter and areA is equal");
        } else {
            System.out.println("perimeter is greater");
        }
    }
}
