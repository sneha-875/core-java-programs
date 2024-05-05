package OPPs.nested_class;

public class NC_2 {
    public static void main(String[] args) {
        OC o1= new OC();
        System.out.println(o1.a);
        System.out.println(o1.o);

      //  OC.SCN sc=new OC.SCN();
       // sc.show();

    }
}

class OC{
   static  int o=10;
    int a=100;
}

class SCN{
    void show(){
       // System.out.println(o);
       // System.out.println(a);
    }
}
