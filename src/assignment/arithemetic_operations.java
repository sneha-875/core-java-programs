package assignment;

import java.util.Scanner;

public class arithemetic_operations {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number one");
        int num1=sc.nextInt();

        System.out.println("enter the number two");
        int num2=sc.nextInt();

        System.out.println("enter the airthemetic operation +,-%,/,* to perform ");
        char c2=sc.next().charAt(0);

        switch(c2){

            case '+':
                System.out.println("result " + (num1 + num2));
                break;
            case '-':
                System.out.println("result " + (num1 - num2));
                break;
            case '/' :
                System.out.println("result " + (num1 / num2));
                break;
            case '*':
                System.out.println("result " + (num1 * num2));
                break;
            case '%' :
                System.out.println("result " + (num1 % num2));
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}
