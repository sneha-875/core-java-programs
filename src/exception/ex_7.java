package exception;

public class ex_7 {
    public static void main(String[] args) {

        // if i want to execute the code 100% then finally is used

        try {
            String s1 = null;
            s1.trim();

        } catch (Exception e){

            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("i am done and finally");
              //driver.close();
            //db.close();
        }
    }
}
