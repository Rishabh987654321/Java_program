package Strings;

public class stringBuilder {
    public static void main(String[] args) {
        //declaring a string builder
        StringBuilder str=new StringBuilder(100);//if we have declared empty then the default capacity id 16
        StringBuilder s=new StringBuilder("hello");
        s.append(" world");
        System.out.println(s);
        s.setCharAt(0,'m');//We can modify any index of string using set builder
        System.out.println(s);
        s.insert(2,'e');//inserts character 'e' at index 2
        System.out.println(s);
        s.deleteCharAt(2);//deletes the character at index 2 in string s
        s.delete(2,4);//takes a starting index and a ending index (ending index is exclusive )
        System.out.println(s);

        StringBuilder st=new StringBuilder("rishabh");
        st.reverse();
        System.out.println(st);
        System.out.println(st.substring(2,3));
        System.out.println(st.substring(2));
        System.out.println(st.lastIndexOf("h"));
        System.out.println(st.lastIndexOf("h",2));

    }
}
