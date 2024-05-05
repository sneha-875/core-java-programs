package OPPs.nested_class;

public class AC_1 {

    public static void main(String[] args) {

        A e1= new A(){
            @Override
            public void u1(){
                System.out.println("u1");
            }
        };
    }
}
interface A{
    void u1();
}
