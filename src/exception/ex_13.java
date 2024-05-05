package exception;

public class ex_13 {
    public static void main(String[] args) {
        Hello h=new Hello();
        h.process();
        System.out.println("hello");
    }
}
class Hello{
    public int process(){
       int a=10/0;
       return a;
    }
}

