package OPPs.abstraction.using_abstract_class.example_6;

public class ab_005 {
    public static void main(String[] args) {
        abc a=new P();
        a.m1();   // dynaic dispatch
    }
}

abstract class abc{

    abstract void m1();
}
class P extends abc{

    @Override
    void m1(){
        System.out.println("imp");
    }


}
