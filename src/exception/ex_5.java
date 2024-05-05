package exception;

public class ex_5 {

    public static void main(String[] args) {

        try {
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException exception){

    } catch(Exception e){
        e.printStackTrace();
    }
}
}
