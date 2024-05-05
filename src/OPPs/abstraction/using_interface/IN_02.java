package OPPs.abstraction.using_interface;

public class IN_02 {
    public static void main(String[] args) {

    }
}

interface pp{
    int a=10;      //final static variable-constant
    void m_1();
}

abstract class AB{
    abstract void say();
}

abstract class CC implements pp{
    int a2=10;
}

class pro extends CC{
    @Override
    public void m_1() {

    }
}
