package exception;

public class ex_11 {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (Exception a) {
            System.out.println(" i am in catch 01");
        } finally {
            System.out.println(" finally 01");
        }
        try {
            int a = 10 / 0;
        } catch (Exception a) {
            System.out.println("i am catch 02");
        } finally {
            System.out.println("finally 02");
        }
        try{

            int a = 10 / 0;
        } catch (Exception a) {
            System.out.println("i am catch 03");
            System.exit(-1);

            // finally will not be called
        } finally {
            System.out.println("finally 02");
        }

    }



}

