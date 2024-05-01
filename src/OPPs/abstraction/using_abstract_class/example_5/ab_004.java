package OPPs.abstraction.using_abstract_class.example_5;

public class ab_004 {

    public static void main(String[] args) {

    }
}

abstract class film{

    String name;
    film(String fname){
        this.name=fname;
    }

    {
        System.out.println("iib");
    }

    void show(){

        System.out.println(this.name);
    }
}
class childfilm extends film{

    childfilm(String fname){

        super(fname);
    }
}
