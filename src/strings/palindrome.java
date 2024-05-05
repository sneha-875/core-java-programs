package strings;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {

        // naman,1331,malaylam.madam,mom

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");

        String user_input=sc.next();

        StringBuilder stb1=new StringBuilder(user_input);
        // reverse function returns stringbuilder itself so we have to use tosting to make it string
        String rev_user_input=stb1.reverse().toString();

        if(user_input.equalsIgnoreCase(rev_user_input)) {

            System.out.println("string is palindrome ->"+ user_input);
        } else{
            System.out.println("string is not palindrome->"+ user_input);
        }

    }
}
