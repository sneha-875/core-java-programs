package loops;

public class basic_for_loop_7 {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            System.out.println(i);
            if(i==5){
                continue;
            }
            System.out.println("after");
        }
    }
}
