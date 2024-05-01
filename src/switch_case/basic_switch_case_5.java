package switch_case;

public class basic_switch_case_5 {
    public static void main(String[] args) {
        int item=003;
        switch(item){

            case 001,002,003:
                System.out.println("it is electronic gadget");
                 break;
            case 004,005,007:
                System.out.println("it is mechanical gadget");
                break;
            default:
                System.out.println("it is not a gadget");
        }
    }
}
