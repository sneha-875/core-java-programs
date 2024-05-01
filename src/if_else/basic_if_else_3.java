package if_else;

import java.util.Scanner;

public class basic_if_else_3 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num >20){
            System.out.println("num >20");
        }
        else if(num > 10){
            System.out.println("num is between 10 and 20");
        }
        else{
            System.out.println("num <20");
        }
        sc.close();

    }
}
