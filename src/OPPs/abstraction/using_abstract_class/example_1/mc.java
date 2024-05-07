package OPPs.abstraction.using_abstract_class;

public class mc {
    public static void main(String[] args) {

        dog d=new dog();
        d.say();
        d.say();
        d.say2();
        d.bark();

        //we cannot create a object of abstract class because it is incomplete class
        //animal a=new animal();

        animal a2=new dog();
        a2.m1();
        a2.say();
        a2.say2();
      //  a2.bark();         this is not allowed as bark() is not present in animal class
    }
}
