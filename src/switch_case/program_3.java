package switch_case;

import java.util.Scanner;


// take user i/p as char and tell user if it vowel
public class program_3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character and i will tell you if it vowel or not");
        char c=sc.next().toCharArray()[0];
        System.out.println(c);

        switch(c){
            case 'a' :
                System.out.println("vowel");
                break;

            case 'b' :
                System.out.println("vowel");
                break;

            case 'c' :
                System.out.println("vowel");
                break;
            case 'd' :
                System.out.println("vowel");
                break;
            case 'e' :
                System.out.println("vowel");
                break;
            default:
                System.out.println("not a vowel");

        }





    }
}
