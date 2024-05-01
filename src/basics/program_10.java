package basics;

import java.util.Scanner;

public class program_10 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value for x");
        double x=sc.nextDouble();

        System.out.println("enter the value for y");
        double y=sc.nextDouble();

        System.out.println("enter the value for z");
        double z=sc.nextDouble();

        double result;
        // 3/x^2  + y^2 -|z|

        result=Math.cbrt((Math.pow(x,2) + Math.pow(y,2)- Math.abs(z)));
        System.out.println(result);
        sc.close();
    }
}
