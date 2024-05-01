package switch_case;

import java.util.Scanner;

public class traffic_light_simulation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1-3 which state you are in");
        int state=sc.nextInt();

        switch(state){
            case 1:
                System.out.println("next state will be yellow");
                break;
            case 2:
                System.out.println("next state will be green");
                break;
            case 3:
                System.out.println("next state will be red");
                break;
            default:
                System.out.println("invalid state");


        }
    }
}
