package arrays;

public class AR_2 {

    public static void main(String[] args) {
        //elements are fixed
        int [] ages= {27,31,32,33,34};

        //default value of all elements will be zero
        int [] ages2 =new int[5];
        System.out.println(ages2[0]);
        System.out.println(ages2[2]);
        System.out.println(ages2[4]);

        //assign values
        ages2[0]=12;
        System.out.println(ages2[0]);

        String[] breakfast_item={"milk","coffee","idli","poha","fruits"};
        System.out.println(breakfast_item.length);
    }
}
