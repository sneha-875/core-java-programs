package arrays;

public class AR_1 {

    public static void main(String[] args) {

        int a=10;

        // 2 first way to declare an array
        int [] ages={27,31,32,33,34};
        int ages4 []={34,89,56};

        //prints the reference address
        System.out.println(ages);
        System.out.println(ages4[0]);

        //prints the lenth of array
        System.out.println(ages.length);

        //second way to declare an array
        int [] ages2= new int[5];

        ages[0]=27;
        ages[1]=31;
        ages[2]=32;
        ages[3]=33;
        ages[4]=34;

        // prints the elements of array
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        // we get exception ArrayIndexOutOfBoundsException
        //System.out.println(ages[5]);
        //System.out.println(ages[-1]);



    }
}
