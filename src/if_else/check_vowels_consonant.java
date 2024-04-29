package if_else;

import java.util.Scanner;

//CHECK CHAR IS VOWEL OR CONSONANT
public class check_vowels_consonant {

    public static void main(String[] args) {

        System.out.println("enter the character");
        Scanner sc =new Scanner(System.in);
        // for srtring we dont use sc.nextInt()
       char c=sc.next().charAt(0);
       if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u'|| c=='A' || c=='E'|| c=='I' || c=='O'|| c=='U'){

            System.out.println("char1 is vowel");

        } else{
            System.out.println("char1 is consonant");
        }
         sc.close();
    }
}
