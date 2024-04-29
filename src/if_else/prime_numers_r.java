package if_else;

import java.util.Scanner;



//PRIME NUMBERS
public class prime_numers_r {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number ");
        int num = sc.nextInt();

        if(num % 2 !=0){
            System.out.println("num is prime number" +num);

        }
        else
            System.out.println("num is not prime number" +num);
    }
}
