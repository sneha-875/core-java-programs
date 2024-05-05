package arrays;

import java.util.Scanner;

public class AR_8 {

    public static void main(String[] args) {
        // taking input from user
        Scanner sc = new Scanner(System.in);
        // declaring an array
        float[] marks = new float[5];

        System.out.println("enter the subject 1 marks");
        marks[0] = sc.nextFloat();

        System.out.println("enter the subject 2 marks");
        marks[1] = sc.nextFloat();

        System.out.println("enter the subject 3 marks");
        marks[2] = sc.nextFloat();

        System.out.println("enter the subject 4 marks");
        marks[3] = sc.nextFloat();

        System.out.println("enter the subject 5 marks");
        marks[4] = sc.nextFloat();

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 30) {
                System.out.println("failed in subject" + marks[i]);
            }
            System.out.println(marks[i]);
        }
        int j=0;
        while(j<marks.length){
            System.out.println(marks[j]);
            j++;
        }
        sc.close();
    }
}
