package OPPs.abstraction.using_interface;

public class IN_05 {

    public static void main(String[] args) {
    }
}

interface face1{
    void x1();
    int a=10;
}

interface face2{
    void x2();
    int b=11;
}

class hh implements face1, face2{

    @Override
   public void x1(){

    }
    @Override
    public void x2(){

    }
}
