package exception;

public class ex_2 {
    public static void main(String[] args) {

        String name="snehs";

        try {

            name.trim();

            int a = 10 / 0;

        } catch(NullPointerException | ArithmeticException e2) {
            System.out.println("can't to train for null ref");
        }

        System.out.println("this line i want to execute");
    }
}
