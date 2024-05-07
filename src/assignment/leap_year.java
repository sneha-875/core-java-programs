package assignment;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the year");
        int year=sc.nextInt();

        if((year % 4 == 0) && year %100 !=100|| (year %400 ==0)){

            System.out.println("it is a leap leap");
        }
        else
            System.out.println("it is not a leap leap");

    }
}
