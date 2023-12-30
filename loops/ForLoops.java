package loops;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {//all the three conditions in for loop is optional we cam do the initialisation before the for loop
            System.out.println(i);
        }


        int i = 1;
        for (; i <= 10; ) {
            System.out.println(i);
            i++;
        }//we have not declared initial and increment statement inside for loop as it is optional, only semicolon is mandatory
    }

}
