package arrays;

public class AR_9 {
    public static void main(String[] args) {

        int []arrays={30,40,50};
        int [] arrays2= new int[3];

        for (int i = 0; i <arrays.length ; i++) {
            arrays[i] = arrays[i] *2;
        }
        for (int i = 0; i <arrays.length ; i++) {
            System.out.println(arrays[i]);
        }
    }
}
