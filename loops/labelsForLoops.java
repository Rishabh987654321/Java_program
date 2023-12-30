package loops;

//labels for loop is basically name given to a particular loop
public class labelsForLoops {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i < 10; i++) {
            inside:
            for (int j = 1; j < 10; j++) {
                break outer;//means break the outer loop
            }
        }


        //another example
        int num = 1;
        while (num <= 50) {
            divisibilityCriteria:
            if (num % 3 == 0) {
                num++;
                break divisibilityCriteria;//shows which statement to break
            }
            System.out.println(num);
            num++;
        }
    }
}
