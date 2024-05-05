package OPPs.abstraction.using_interface;

public class IN_03 {

    public static void main(String[] args) {

    // instance of interface is not possible
     //   ICanFly i= new ICanFly() ;

        bird ic= new bird();
        ic.fly();
        ic.eat();



    }
}

interface ICanFly{

    void fly();   //by default public abstract
    default void eat() {
        System.out.println("default");
    }

    static void sleep(){
        System.out.println("static");
    }
}

class bird implements ICanFly{
    @Override
    public void fly(){
        System.out.println(" ia am flying like a bird");
    }
}



