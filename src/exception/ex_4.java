package exception;

public class ex_4 {
    public static void main(String[] args) {

            try {
                String ip = args[0];
                int a = Integer.parseInt(args[0]);
                int b = 10 / a;

                System.out.println(a);
                System.out.println(b);
// if there are multiple exception then we will simply write exception as it is the parent class
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


