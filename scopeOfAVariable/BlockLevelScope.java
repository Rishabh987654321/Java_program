package scopeOfAVariable;

class ALGEBRA {
    void demo_block() {
        int x = 10;
        {
            System.out.println(x);//x can be accessed here as it is in the same block as it was declared
            int y = 10;
            System.out.println(y);//we can only access y in this block
        }
        //System.out.println(y);//y can not be accessed as it was not in the same block as we declared it
    }
}


public class BlockLevelScope {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }//the scope of i ends here it can not be accessed after this curly braces
        // System.out.println(i);// i can not be accessed here
    }
}
