import java.util.Arrays;
import java.util.stream.Stream;

public class IntStrings {
    //Recursion
    public static void main(String[] args) {

       // double v = Double.parseDouble("0.0");
        long l = (long)Double.parseDouble(String.valueOf("0.0"));
        System.out.println("args = " +l);


        //tail_rec(5);

    }

    //tail call recursion is a special case of recursion where the last call(or the tail call) is the function itself.
    public static void tail_rec(int n){
        sum(n,0);
    }
    public static int sum(int n,int running_total)
    {
        if(n==0) return running_total;
        else return sum(n-1,running_total+n);
    }

    //recursion

    public static int sum(int n){
        if(n==0) return 0;
        else return n+sum(n-1);
    }

}
