package switch_case;

import java.util.Scanner;

public class program_2 {

    public static void main(String[] args) {

        //web automation
        //ask user which browser you want me to run

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the browser name");
        String b=sc.next();
        b=b.toLowerCase();

        switch(b){
            case "chrome":
                System.out.println("starting chrome browser");
                break;
            case "firefox":
                System.out.println("starting firefox browser");
                break;
            case "edge":
                System.out.println("starting edge browser");
                break;
            default:
                System.out.println("no idea about the browser");

        }
    }
}
