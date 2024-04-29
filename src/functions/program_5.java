package functions;

public class program_5 {

    public static void main(String[] args) {

        String u=username();
        System.out.println(u);
          Boolean b=login();
        System.out.println(b);
    }

    static Boolean login(){

        if(username()=="Sneha") {
            return true;
        }
        else
            return false;
    }
        static String username(){
            return "sneha";

    }
}
