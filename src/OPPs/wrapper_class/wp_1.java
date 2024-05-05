package OPPs.wrapper_class;

public class wp_1 {
    public static void main(String[] args) {

        int b = 10;
        Integer b_wp = b;
        System.out.println(b_wp);


      //  String  s1= x;             // incorrect
      //  String s1=(String) x;      // incorrect
      //  String s1= x + "" ;         // correct but not recommended coz of concatenation operator

      //primitive to string
        int x=123;
        String s2= String.valueOf(x);
        System.out.println(s2);

        String s3=Integer.toString(x);
        System.out.println(s3);

        double d=90.76;
        String sd1= String.valueOf(d);
        String sd2=Double.toString(d);

        System.out.println(sd1);
        System.out.println(sd2);






    }
}
