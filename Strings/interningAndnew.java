package Strings;
public class interningAndnew {
    public static void main(String[] args) {
        String str="hello";//both the string will be stored at same memory address and only one address will be used no extra space is created this is called interning
        String gtr="hello";
        System.out.println(str+gtr);

        String s=new String("hello");//this will remove the affect of interning as new keyword will create another space for this string in heap memory
        System.out.println(str+s);

        
    }
}
