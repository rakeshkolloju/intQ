import java.util.Arrays;

public class ArrQ {
    public static void main(String[] args) {

        int[] arr={1,2,3,9};
        int[] arr1=Arrays.copyOf(arr,3);

        //solve(arr,5);
        System.out.println(sumFromArr(arr,4));   ;

    }
    public static void solve(int[] arr,int sumVal){
        for (int i = 0; i <arr.length ; i++) {
          if(sumVal==  sum(arr[i],arr[i+1]))
          {
              System.out.println("Yes");
              break;
          }
        }
    }
    public static int sum(int a,int b){
        return a+b;
    }

public static int sumFromSubArr(int[] arr, int length){

    for (int i = 0; i <arr.length ; i++) {
        sumFromSubArr(arr,length-1);
    }
        return 0;
}
    public static int sumFromArr(int[] arr, int length){
        if(length<=0) return 0;
        else return arr[length-1]+sumFromArr(arr,length-1);
    }
}
