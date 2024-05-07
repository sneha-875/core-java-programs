package assignment;

public class max_salary_input_array {

    public static void main(String[] args) {

        int [] arr={30,50,60,90,10,100,999};
        int max_salary=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]> max_salary){

                max_salary=arr[i];
            }

        }
        System.out.println("max salary->" +max_salary);
    }
}
