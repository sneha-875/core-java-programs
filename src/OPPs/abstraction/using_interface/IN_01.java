package OPPs.abstraction.using_interface;

public class IN_01 {

    public static void main(String[] args) {

        standardLogin s1= new AdminLogin();
        standardLogin s2= new userlogin();
        standardLogin s3= new buyerlogin();

        s1.login();
        s2.login();
        s3.login();
        s1.m2();

    }
}

interface A{}
interface B{}
interface standardLogin{

    // in interface we cannot have concrete methods

    int a=10;
    void login();  //abstract method
    default void m2(){
        System.out.println("default function");
    }
}

class AdminLogin implements standardLogin,A{
    @Override
    public void login() {
        System.out.println("admin login");
    }
}

class userlogin implements standardLogin,B{
    @Override
    public void login(){
        System.out.println("user login");
    }
}
class buyerlogin implements standardLogin{
    @Override
    public void login(){
        System.out.println("buyer login");
    }
}

class c implements A,B{

}

