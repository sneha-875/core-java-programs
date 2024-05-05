package homework;

public class fizzbuzz {

    public static void main(String[] args) {

        //write a program that prints numbers from 1 to 100.However for multiple of 3,print "fizz"
        //instead of the number and multiples of 5,print :buzz".For numbers
        //that are multiple of both 3 and 5  print fizzbuzz
        for(int i=1;i<=100;i++){


            if(i % 3==0 && i %5==0) {

                System.out.println("fizzbuzz");
            }
            else if (i %5 ==0){
                System.out.println("buzz");

            }
            else  if(i % 3==0 ){
                System.out.println("fizz");

            }
            else
                System.out.println(i);


        }
    }
}
