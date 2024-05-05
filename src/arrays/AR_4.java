package arrays;

public class AR_4 {
    public static void main(String[] args) {

        // ==        -> checks for reference
        // .equals() -> checks for values/content

        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        // references are different
        System.out.println(arr1==arr2);

        int [] arr3=arr1;
        System.out.println(arr1==arr3);

        // references are different
        // equals is coming from objects.java which checks for reference only
       System.out.println(arr1.equals(arr2));

    }
}
