package arrays;
public class max_salary_WHILELoop {
    public static void main(String[] args) {

        int [] salaries={30,50,60,90,-10,100,999};
        //int max_salary=Integer.MIN_VALUE;
        int max_salary=salaries[0];

        int j=0;
        while(j<salaries.length){

            if(salaries[j] >max_salary){

                max_salary= salaries[j];
            }

            j++;
        }
        System.out.println("max salary" +max_salary);

    }
}
