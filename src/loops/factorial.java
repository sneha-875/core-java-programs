package loops;

import java.util.Scanner;

// factorial
//1!-> 1
//2! -> 2*1
//3!->3*2*1 ->6
//4! ->4*3*2*1 ->24
public class factorial {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find the factorial");
        int num=sc.nextInt();

        long fact=1;


        for(int i=1;i<= num; i++){

            fact=fact*i;

        }
        System.out.println(fact);
        sc.close();
    }
}
