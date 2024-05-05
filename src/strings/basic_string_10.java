package strings;

public class basic_string_10 {

    public static void main(String[] args) {

        // value stored in string pool
        String s1="sneha";
        //value stored in object area
        //value of string is immutable i.e it's value cannot be changed
        String s2= new String("sneha");

        //value of stringbuffer can be changed
        // 2 strings are created one by stringbuffer zand one by stringbuilder
        //stringbuffer and stringbilder can be changed multiple times and no new string is created

        StringBuffer stb= new StringBuffer("sneha");
        stb.append("desai");
        System.out.println(stb);

        StringBuilder stbu= new StringBuilder("sneha");
        stbu.append("desai");
        System.out.println(stbu);
    }
}
