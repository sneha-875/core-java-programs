package switch_case;

public class basic_switch_case_7 {
    public static void main(String[] args) {

        int a=11;
        switch(a){
            // if we use default in starting or middle we need to give break
            // if we use default in end we dont'n need to give break

//            default:
//                System.out.println("default");
              //  break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("default");
                 break;
            case 13:
                System.out.println("13");


        }
    }
}
