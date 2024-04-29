package if_else;

import java.util.Scanner;


//PROGRAM TO CHECK IF NUMBER IS PSOSITIVE,NEGATIVE AND ZERO
public class check_positive_negative_numbers {
    public static void main(String[] args) {


        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();

        if(num >0){
            System.out.println("number is POSITIVE");
        }
        else if(num <0){
            System.out.println("number is negative");
        }
        else
            System.out.println("number is ZERO");

        sc.close();
    }
}
