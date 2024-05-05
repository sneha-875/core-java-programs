package OPPs.abstraction.using_abstract_class.example_3;

public class AB_002 {

    public static void main(String[] args) {


    }
}
abstract class person1{
    abstract void say();
    void eat(){
        System.out.println("hello eat from person");
    }
}
 class student1 extends person1{

    @Override

    void say(){

        System.out.println("student eat");
    }
}