package strings;

public class basic_strings_2 {
    public static void main(String[] args) {

        //There are two ways of creating string
        //both of them are different in a way how they are stored in JVM
        //first way is uing assignment oprator
        String name="sneha";
        //second way is by using new operator
        String name2= new String("desai");

        System.out.println("your name is-> "+name);
        System.out.printf("your name is %s" ,name);
        System.out.println(name2);
    }
}
