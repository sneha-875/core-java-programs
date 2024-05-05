package OPPs.nested_class;

public class NC_4 {

    Outer og=new Outer();
  //  og.print_secret();

}
class Outer{

    static int zz=10;
     int zz1=10;
     void print_secret(){
         System.out.println("outer class");
         new Inner().q2_secret();
     }

     class Inner{
         static int secret=90;
         void q2_secret(){
             System.out.println("inner secret" + secret);
         }
     }
}
