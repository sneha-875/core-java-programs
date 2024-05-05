package exception;

public class ex_8 {
    public static void main(String[] args) {
       ProblemF p=new ProblemF();
       int a= p.show();
       System.out.println(a);

    }
}

class ProblemF{

    int a=10;
    int show(){

        try{
            a=10/0;
            System.out.println("in try" +a);
            return a;
        } catch(Exception e){
            try{
                a=20/0;

            } catch(Exception e1){
                System.out.println("yes");
            }
            System.out.println("in catch" +a);
            return a;
        }
    }
}
