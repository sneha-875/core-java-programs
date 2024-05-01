package strings;

public class basic_strings_9 {
    public static void main(String[] args) {

        String s1 = "Sneha@123";
        String s2 = s1.toLowerCase();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        // staring index in inclusive and ending index is exclusive i.e get value from 0-2
        System.out.println(s1.substring(0,3));
        System.out.println(s1.indexOf("h"));


    }
}



