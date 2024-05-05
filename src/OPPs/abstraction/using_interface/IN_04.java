package OPPs.abstraction.using_interface;

public class IN_04 {
    public static void main(String[] args) {
         calc c= new normalCal();
         c.costheta();
         calc.sintheta();   //static method interface.method
    }
}
interface calc{
    void add();
    void sub();

    default void costheta(){
        System.out.println("costheta");
    }

    static void sintheta(){
        System.out.println("sintheta");
    }
}

class normalCal implements calc{

    @Override
    public void add(){
        int a=10;
        int b=20;
        System.out.println("A+B" + a+b);
    }

    @Override
    public void sub(){

    }
}

class sci_cal implements calc{

    public void add(){
        double x=3.478;
        double y=4.77;
        System.out.println("X+Y"+ x+y);

    }
    @Override
    public void sub(){

    }
}
