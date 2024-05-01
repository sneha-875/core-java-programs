package switch_case;

import java.util.Scanner;

// to check grade based on marks
//90-> 90/10 ->9 ->A (90-100)
//80-> 80/10 ->8 ->B (80-89)
//70-> 70/10 ->7 ->C (70-79)
//60-> 60/10 ->6 ->D (60-69)
//50-> 50/10 ->5 ->E (50-59)
//40-> 40/10 ->4 ->F (40-49)

public class check_grades {
    public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
        System.out.println("enter your marks");
int marks=sc.nextInt();

marks=marks/10;
//System.out.println(marks);

switch(marks) {

    case 9:
        System.out.println("A");
        break;

    case 8:
        System.out.println("B");
        break;
    case 7:
        System.out.println("C");
        break;
    case 6:
        System.out.println("D");
        break;
    case 5:
        System.out.println("E");
        break;
    case 4:
        System.out.println("F");
        break;
    default:
        System.out.println("none");
}
}
}
