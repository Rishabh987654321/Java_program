package loops;

// using break printing all the number except those multiple of 3
public class breakStatement {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 50) {
            if (num % 3 == 0) {
                num++;//here num++ because after third iteration in while loop the number will be skipped but the next number will not be updated
                continue;
            }
            System.out.println(num);
            num++;
        }


        //same code with do while
//        do {
//            if (num%3==0){
//                num++;
//                continue;
//            }
//            System.out.println(num);
//            num++;
//        }while (num<=50);
    }


}
