package if_else;
//Triangle Classifier

// if triangle is equilateral (all sides are equal)
//isoceles(exactly 2 sides are equal)
//scalene(no sides are equal)

import java.util.Scanner;

public class traiangle_classifier {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter side one");
        int side1=sc.nextInt();

        System.out.println("enter side one");
        int side2=sc.nextInt();

        System.out.println("enter side one");
        int side3=sc.nextInt();

        if(side1==side2 && side2==side3 && side3==side1){
            System.out.println("triangle is equilateral");
        }
        else if(side1== side2 || side2== side3 || side3==side1){
            System.out.println("triangle is isoceles");
        }
        else
            System.out.println("triangle is scalene");

    }
}
