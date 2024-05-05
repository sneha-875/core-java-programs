package exception;

public class ex_10 {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch(Exception a){
            System.out.println(" i am in catch 01");
        } finally{
            System.out.println(" finally 01");
        }
        try{
            int a=10/0;
        } catch(Exception a){
            System.out.println("i am catch 02");
        } finally{
            System.out.println("finally 02");
        }
    }

}
