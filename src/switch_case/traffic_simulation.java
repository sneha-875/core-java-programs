package switch_case;

import java.util.Scanner;

public class traffic_simulation {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1-3 which state you are in");

        int state=sc.nextInt();
        int msg= switch(state)
        {
            case 1:
                System.out.println("red");
                yield 2;

            case 2:
                System.out.println("yellow");
                yield 3;

            case 3:
                System.out.println("green");
                yield 1;

            default:
                System.out.println("not working");
                yield 0;
        };

        System.out.println(msg);

    }
}

