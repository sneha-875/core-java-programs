package strings;

public class basic_string_8 {
    public static void main(String[] args) {

        String s1="sneha";
        // in char index starts from 0
        char c=s1.charAt(4);
        System.out.println(c);

        boolean result=s1.contains("h");
        System.out.println(result);

        s1=s1.concat("desai");
        System.out.println(s1);
    }
}
