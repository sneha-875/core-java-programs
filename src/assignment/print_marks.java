package assignment;

import java.util.Scanner;

public class print_marks {
    public static void main(String[] args) {

        float [] marks=new float[4];

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the subject 1 marks");
        marks[0] = sc.nextFloat();

        System.out.println("enter the subject 2 marks");
        marks[1] = sc.nextFloat();

        System.out.println("enter the subject 3 marks");
        marks[2] = sc.nextFloat();

        System.out.println("enter the subject 4 marks");
        marks[3] = sc.nextFloat();

        System.out.println("marks are");
        for (int i = 0; i < marks.length; i++) {

            System.out.print(marks[i]);
        }

    }
}
