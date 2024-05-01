package switch_case;

public class basic_switch_case_8 {

    public static void main(String[] args) {
     // if there is a mismatch  default is executed
        int a = 11;
        switch (a) {
            default:
                System.out.println("default");
                break;

            case 10:
                System.out.println("10");
                break;
            case 9:
                System.out.println("10");

        }
    }
}
