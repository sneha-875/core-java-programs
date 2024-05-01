package OPPs.abstraction.using_abstract_class.example_7;

public class abs_006 {
    public static void main(String[] args) {

    }
}

abstract class shape{

    abstract void area();
    static void f(){
        System.out.println("f1");
    }
}

class sq extends shape{

    static void f(){
        System.out.println("f1");
    }
    @Override
    void area(){
        System.out.println("area ");
        shape.f();

    }
}
