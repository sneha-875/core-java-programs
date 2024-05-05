package OPPs.nested_class;

public class NC_1 {

    public static void main(String[] args) {
        OuterClass o=  new OuterClass();
        // instance of inner class can't be created because they are hidden
        //main function do not have a idea that the outer class has inner class or not
        //InnerClass i= new InnerClass();
    }
}

class OuterClass{

    // innerclass is added for security reasons
    class InnerClass{

    }
}
