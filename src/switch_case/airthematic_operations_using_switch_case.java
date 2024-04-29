package switch_case;

import java.util.Scanner;

public class airthematic_operations_using_switch_case {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num=sc.nextInt();

        System.out.println("enter the second number");
        int num2=sc.nextInt();

        System.out.println("enter the airthemetic operation +,-%,/,* to perform ");
        char c2=sc.next().charAt(0);

        switch(c2) {
            case '+':
                System.out.println("result " + (num + num2));
                break;

            case '-':
                System.out.println("result" + (num - num2));
                break;

            case '%':
                System.out.println("result" + (num % num2));
                break;

            case '/':
                System.out.println("result" + (num / num2));
                break;

            case '*':
                System.out.println("result" + (num * num2));
                break;

            default:
                System.out.println("invalid operator");
        }
        }


    }

