package assignment;

import java.util.Scanner;

public class positive_negative_number {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number");
        int num=sc.nextInt();

        if(num> 0){

            System.out.println("number is positive");
        }
        else if(num<0){
            System.out.println("number is negative");
        }
        else
            System.out.println("number is zero");
    }
}
