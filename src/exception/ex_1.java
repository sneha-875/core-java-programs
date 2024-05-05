package exception;

public class ex_1 {

    public static void main(String[] args) {

        String name=null;

        try {
            //unchecked exception
            name.trim();
        }catch (Exception e) {
           // catch(Throwable e) {
            System.out.println("can't trim for null ref");
        }
        System.out.println("this line i want to execute");
    }
}
