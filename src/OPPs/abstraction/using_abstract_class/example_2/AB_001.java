package OPPs.abstraction.using_abstract_class.example_2;
//concrete/complete class
public class AB_001 {

    public static void main(String[] args) {

      //  GF gf= new GF();
        //  F f=new F();
        son s=new son();
        s.loan();

        GF s3=new son();
        F s2=new son();
        son s4=new son();
        s.loan();

    }


}

//incomplete class
abstract class GF{
    abstract void loan();
}

abstract class F extends GF{

}

class son extends F{
    @Override

    void loan(){
        System.out.println("i have to give");
    }
}

