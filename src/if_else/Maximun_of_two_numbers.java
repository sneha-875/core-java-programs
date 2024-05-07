package if_else_prorams;

import java.util.Scanner;

public class Maximun_of_two_numbers {

    public static void main(String[] args) {

        //max number in two


        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number 1");
        int num1 = sc.nextInt();

        System.out.println("enter the number 2");
        int num2 = sc.nextInt();

        if(num1>num2)
               System.out.println("max no is" +num1);

       else {
          System.out.println("max no is"+num2);
            }
           sc.close();

    }
}
