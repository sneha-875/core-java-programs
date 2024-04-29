package OOPS;

public class ATB {
    String name;
    String courseName;
    long phonenumber;
    String emailid;
    byte age;

    void eat(){
        System.out.println(" i can eat");
    }
    @Override

    // if we don't write override it will give referce address

    public String toString(){
        System.out.println(" ia am coming from object class");
        return null;
    }

}


