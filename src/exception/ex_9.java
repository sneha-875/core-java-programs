package exception;

public class ex_9 {

    public static void main(String[] args) {

        try{

            int a=0;
            int x=10/a;

        } catch (Exception e){
            System.out.println("exit");
            System.exit(0);
            // this is one case where finally will not be executed/called
        } finally{
            System.out.println(" i am final");
        }
    }
}
