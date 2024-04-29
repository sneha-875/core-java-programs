package loops;

public class even_odd_with_continue {

    public static void main(String[] args) {

        for(int i=1;i<=10;i++){

            if(i % 2== 0){

                System.out.println("even nos  " + i);
                continue;
            }
                System.out.println("odd nos  " + i);

        }
    }
}
