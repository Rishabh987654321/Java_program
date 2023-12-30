package scopeOfAVariable;

class algebra {//we can not name a class as same if we are in same package

    int sum() {
        int p = 100;//we can not access these variable outside this method
        int q = 10;
        return p + q;
    }


//    int subtract(){
//        //return p-q;//we couldn't access p and q here as it was only in scope of sum method
//    }

}

public class MethodLevelScope {
    public static void main(String[] args) {
        algebra obj = new algebra();
        System.out.println(obj.sum());
    }
}
