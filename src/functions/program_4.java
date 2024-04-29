package functions;

public class program_4 {
    public static void main(String[] args) {
        String o=appdeasai("sneha");
        System.out.println(o);

        a_print("sneha");
        appdeasai_2();
        q_print();

    }

    static String appdeasai(String s){   //parametrized returning function
        System.out.println("parametrized returning function" );
        return s+ "desai";
    }

    static String appdeasai_2(){        //non-parametrized returning function

        System.out.println("non-parametrized returning function" );
        return "desai";
    }

    static void a_print(String s){   //parametrized non-returning function
        System.out.println("parametrized non-returning function" );
    }

    static void q_print(){          //non-return and non parametrized
        System.out.println("non-return and non parametrized");
    }
}
