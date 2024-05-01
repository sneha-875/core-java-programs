package OPPs.abstraction.using_abstract_class.example_8;

public class abs_7 {
    public static void main(String[] args) {
        currentstudent c= new currentstudent();
        c.walking();
        c.sleeping();
    }
}

abstract class person {

    abstract void sleeping();

    abstract void walking();
}
    abstract class student extends person{

        void sleeping(){
            System.out.println("i am sleeping");

        }
    }

    class currentstudent extends student{

        @Override
        void walking() {
            System.out.println("i am walking");

        }
    }
