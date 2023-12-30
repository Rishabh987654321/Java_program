package BasicsOfJava;

public class typeConversion {
    public static void main(String[] args) {
        // int num=67.90f; this will give error
        int num = (int) (67.90f);//this is called casting i.e. changing datatype of variable
        System.out.println(num);

        int a = 257;
        byte b = (byte) (a);//the max value a byte can store is 256 so if we type cast more than that then the answer is 257 % 256=1
        System.out.println(b);


        byte x = 90;
        byte y = 70;
        byte z = 60;
        int sum = x + y / z;
        System.out.println(sum);//ans--91 here while calculation x y z are converted to int even though they are byte


        int number = 'A';
        System.out.println(number); //here it will automatically give the ascii value of A  even though an char is associated to int , this is type conversion

        System.out.println("你好");//java is unicode       

    }
}
