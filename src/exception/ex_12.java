package exception;

public class ex_12 {

    public static void main(String[] args) {
        Hello1 h=new Hello1();
        h.process();
        System.out.println("hello");
    }
}

class Hello1{
    public int process(){
        throw new NullPointerException();
        //throw new ArithmeticException();
    }
}
