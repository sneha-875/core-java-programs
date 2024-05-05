package arrays;
public class max_salary_in_array {
    public static void main(String[] args) {

        int [] salaries={30,50,60,90,-10,100,999};
        //int max_salary=Integer.MIN_VALUE;
        int max_salary=salaries[0];

        for (int i = 0; i <salaries.length ; i++) {

            if (salaries[i] >max_salary ){

                max_salary=salaries[i];
            }
        }
        System.out.println("max salary ->" + max_salary);
    }
}
