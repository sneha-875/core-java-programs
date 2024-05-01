package OPPs.abstraction.using_abstract_class.eample_4;

public class AB_003 {
    public static void main(String[] args) {

        yo y1= new zo();
        y1.eat();
        y1.say();
        System.out.println(yo.a);
        System.out.println(zo.a);
        yo.foo();              //static function can be called from both yo and zo
        zo.foo();
    }
}

abstract class yo{
    static int a=10;
    abstract void say();

    static void foo() {

        System.out.println("foo from yo");
    }

    void eat(){

        System.out.println("yo eat");
    }
}
class zo extends yo{

    @Override
    void say(){
        System.out.println("zo say");
    }
}