package arrays;

public class AR_11 {
    public static void main(String[] args) {

        // first way of creating 2D array

        int[][] arr_2d={

                {34,12,11},
                {45,78,67},
                {89,34,11}
        };

        // second way of creating 2D array

       // int [][] array_2d_2= new int[3][3];

       // array_2d[0][0]=34;
        // to print rows
        for (int i = 0; i < arr_2d.length; i++) {
        // to print columns
            for (int j = 0; j <arr_2d[i].length ; j++) {

                System.out.println(arr_2d[i][j]);
            }

        }
    }
}


