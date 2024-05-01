package switch_case;

public class yield_switch_case {

    public static void main(String[] args) {

        String code="q";

        String msg = switch(code){

            case "w" :
                System.out.println("hi");
                yield "yes";
            default :
                System.out.println("bye");
                yield "default";

        };
        System.out.println(msg);



        // yield will return something

//        char co = 'A';
//        char val= switch(co) {
//            case 'A':
//                yield 65;
//            case 'B':
//                yield 66;
//            default:
//              //  yield 23;
//                 System.out.println("none");
//                 throw new IllegalStateException("Error");
                // yield -1;
    }
}
