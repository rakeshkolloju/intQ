import java.io.*;
import java.util.Arrays;

public class IntQ2 {
    public static void main(String[] args) throws IOException {
//        System.out.println("Enter Input Stream");
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//
//            while(br.readLine()!=null){
//                br.lines().forEach(x-> System.out.println("sss"+x)    );
//
//                String s = br.readLine();
//                //System.out.println(s);
//            }
//            System.out.println("Done");
//        }
        //0 1 1 2 3 5 8
        //0 1 2 3 4 5 6
//        for (int i = 0; i < 10; i++) {
//            System.out.println(""+i+"="  + fib(i));
//        }
        printFib();


    }
    public static int fib(int n){
        if(n==0 )return 0;
        if( n==1 ||n==2) return 1;
        else {
            return fib(n-1)+fib(n-2);
        }
    }


    public static void printFib(){

       int num1=0;int num2=1;
        for (int i = 0; i <10 ; i++) {
            System.out.println(num1);
            int sumofTwo=num1+num2;
            num1=num2;
            num2=sumofTwo;
        }
    }
}
