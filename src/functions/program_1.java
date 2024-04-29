package functions;

public class program_1 {

    public static void main(String[] args) {
        printsneha();
        int out=add(2,3);
                System.out.println(out);

                nameoffunction();
    }

    static boolean nameoffunction(){
        System.out.println("Boolean");
        return true;
    }


    static void printsneha(){
        System.out.println("sneha");
    }


    static int add(int a,int b) {
        return a + b;
    }
}
