package exception;

public class ex_6 {

    public static void main(String[] args) {

        try {

            String s1 = null;
            s1.trim();

        } catch(Exception e){
           //  System.out.println(e.getMessage());      //for custom message
            e.printStackTrace();                        //prints line no and all other info;prints everything
        }
    }
}
