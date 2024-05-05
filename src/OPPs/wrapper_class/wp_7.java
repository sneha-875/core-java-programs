package OPPs.wrapper_class;

public class wp_7 {
    public static void main(String[] args) {
      Work s1  =new Work();
      // when we pass argument by default it will go to primitive data only
        //arguments are primitive in nature
      s1.show(1,3);
      byte b1=1;
      byte b2=3;
      s1.show(b1,b2);


    }
}

// compile time polymorphism

class Work{
    void show(int a, int b){
        System.out.println("1");
    }

     void show(Byte a,Byte b){
         System.out.println("2");
     }

     void show(byte a,byte b){
         System.out.println("3");
    }
}


