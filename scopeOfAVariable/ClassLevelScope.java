package scopeOfAVariable;

class Algebra {
    int a = 10;//members variable ....these variables can be accessed anywhere in this class ,so they have class level scope
    int b = 20;
    //a and b can be accessed anywhere in this class

    int add() {
        return a + b;//so the member variable were  able to access in the method as the method is in the same class
    }

    int sub() {
        return a - b;//here also we were able to access the member variable as the sub method was in the same class
    }
}


public class ClassLevelScope {
    public static void main(String[] args) {
        //System.out.println(a);//variable a is initialised in class algebra, so it can not be accessed here
        Algebra obj = new Algebra();//object of class algebra
        System.out.println(obj.add());
    }
}
