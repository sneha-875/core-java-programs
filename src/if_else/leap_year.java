package if_else;

import java.util.Scanner;

// LEAP YEAR
public class leap_year {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the year");
        int year = sc.nextInt();

        if((year % 4 == 0) && year %100 !=100|| (year %400 ==0)){

            System.out.println("leap year");
        }
        else
            System.out.println("not a leap year");
    }
}
