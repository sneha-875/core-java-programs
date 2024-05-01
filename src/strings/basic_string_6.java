package strings;

public class basic_string_6 {
    public static void main(String[] args) {

        String name="TheAcademy";
        String name1="TheAcademy";
        String name2=new String("TheAcademy");
        // check the references
        System.out.println(name== name1);
        //check the values
        System.out.println(name.equals(name1));

        System.out.println(name== name2);
        System.out.println(name.equals(name2));

    }
}
