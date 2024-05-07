package assignment;

import java.util.Scanner;

public class largest_in_three_number {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number one");
        int num1=sc.nextInt();

        System.out.println("enter number two");
        int num2=sc.nextInt();

        System.out.println("enter number three");
        int num3=sc.nextInt();

        if(num1>num2){
            System.out.println("num1 largest");

            }
        else if(num2>num3){
            System.out.println("num2 largest");
        }
        else
            System.out.println("num3 largest");
    }
}
