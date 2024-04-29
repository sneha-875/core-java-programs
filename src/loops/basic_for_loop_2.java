package loops;

public class basic_for_loop_2 {

    public static void main(String[] args) {

        final boolean b1= true;

        //valid program but will go into infinite loop

        for(float f=0;b1;){

            System.out.println("Hi");
        }
    }
}
