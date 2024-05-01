package OPPs.polymorshism.mehod_overloading;

public class person {
    void speak(){
        System.out.println("no argument");
    }
    void speak(int i){
        System.out.println("yes int" + i);
    }

    void speak(String i){
        System.out.println("yes string" + i);
    }

    void speak(double i){
        System.out.println("yes double" + i);
    }
}
