package if_else;

import java.util.Scanner;

//FIND LARGEST/MAXIMUN OF THREE NUMBERS
public class maxium_of_three_numbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number one");
        int num1 = sc.nextInt();

        System.out.println("enter the number two");
        int num2 = sc.nextInt();

        System.out.println("enter the number three");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1>=num3){
            System.out.println("num1 is largest of three");
        }

        else if (num2 >= num1 && num2>=num3){
            System.out.println("num2 is largest of three");
        }
        else
            System.out.println("num3 is largest of three");


        //usins ternary operator
        // (b>c) ? b:c

        //start from backwards
        int largest= (num1>num2)? ((num1 >num3) ? num1:num3):((num2>num3)? num2:num3);
        System.out.println(largest);

        sc.close();

    }
}

