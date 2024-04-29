package if_else;

import java.util.Scanner;

public class grade_calculator {

    public static void main(String[] args) {

        // grade calculator


        Scanner sc= new Scanner(System.in);
        System.out.println("enter the score");
        int score=sc.nextInt();

        char grade ;


        if(score >=90 && score <=100) {
            System.out.println("A");
        }
        else if(score >=80 && score<=89) {
            System.out.println("B");
        }
        else if(score >=70 && score<=79) {
            System.out.println("C");
        }
        else if(score >=60 && score<=69) {
            System.out.println("D");
        }
        else if(score >100) {
            System.out.println("LOL");
        }
        else{
            grade='F';
        }
      sc.close();
    }
}
