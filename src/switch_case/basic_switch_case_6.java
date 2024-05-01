package switch_case;

public class basic_switch_case_6 {
    public static void main(String[] args) {

        int item_code=004;
        switch(item_code){


            case 001 -> System.out.println("it's a laptop");
            case 002 -> System.out.println("it's a desktop");
            case 003,004 ->System.out.println("it's a mobile");
            default->System.out.println("hello");

        }

        }
}
