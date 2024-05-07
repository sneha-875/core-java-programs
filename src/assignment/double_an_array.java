package assignment;

import java.util.Scanner;

public class double_an_array {

    public static void main(String[] args) {

        int [] marks ={1,2,3};
        int [] marks_d =new int[4];

        for (int i = 0; i < marks.length; i++) {

            marks_d[i]= marks[i]*2;
        }

        for (int i = 0; i < marks.length; i++) {

            System.out.println(marks_d[i]);
        }


        // second way by taking user input

//        int [] marks =new int[4];
//        int [] marks_d =new int[4];
//
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("enter the subject 1 marks");
//        marks[0] = sc.nextInt();
//
//        System.out.println("enter the subject 2 marks");
//        marks[1] = sc.nextInt();
//
//        System.out.println("enter the subject 3 marks");
//        marks[2] = sc.nextInt();
//
//        System.out.println("enter the subject 4 marks");
//        marks[3] = sc.nextInt();
//
//        System.out.println("marks are");
//
//        for (int i = 0; i < marks.length; i++) {
//            marks_d[i] = marks[i]*2;
//        }
//
//        for (int i = 0; i < marks_d.length; i++) {
//
//            System.out.println(marks_d[i]);
//        }

    }
}
