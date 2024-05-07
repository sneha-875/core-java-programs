package assignment;

import java.util.Scanner;

public class reverse_string {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the string");
        String str1=sc.next();
        String rev;

        StringBuilder stb=new StringBuilder(str1);
        rev=stb.reverse().toString();

        System.out.println(rev);

    }
}
