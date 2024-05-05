package arrays;

public class AR_7 {
    public static void main(String[] args) {
         // this is not possible either you have to change the name of args from line 6 or from line 4
        //String [] args={"sneha","monica","sonu"};

        // it gives exception ArrayIndexOutOfBoundsException
        //here it is not taking default value
       // System.out.println(args[0]);

       // here it is taking default value by using new operator
        // default value is null
        String[] sn= new String[5];
        System.out.println(sn[0]);

    }


}
