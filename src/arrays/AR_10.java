package arrays;

public class AR_10 {

    public static void main(String[] args) {

        int [] ar1={30,45,50};
        int [] ar2= new int[3];

        for (int i = 0; i <ar1.length ; i++) {

            ar2[i]=(ar1[i]* 2);
        }

        for (int i = 0; i <ar2.length ; i++) {
            System.out.println(ar2[i]);
        }
    }
}
