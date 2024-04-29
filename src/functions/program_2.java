package functions;

public class program_2 {

    public static void main(String[] args) {
        //create a calculator having functions od add and sub

        int o_add = add(4, 5);
        System.out.println(o_add);

        int s_sub = sub(2, 5);
        System.out.println(s_sub);

        double sub2 = sub(9, 5);
        System.out.println(sub2);

    }

        static int add(int z, int p){
            return z + p;
        }

        static int sub(int x,int y){
            return x-y;
        }

        static double sub2(double a, double b){
          return a-b;
        }


    }

