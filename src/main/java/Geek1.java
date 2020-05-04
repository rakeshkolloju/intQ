import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Given a string S. The task is to convert characters of string to lowercase.

Note: toLowerCase() method converts all characters of the string into lowercase letter.

Input :
The first line of input contains a single integer T, denoting the number of test cases.
For each testcase there will be only one line containing string S which consists of uppercase or lowercase english alphabets.

Output :
For each testcase in new line, print the string in lowercase.

Constraints :
1 <= T <= 100
1 <= |S| <= 103

Example :
Input :
2
ABCddE
LMNOppQQ

Output :
abcdde
lmnoppqq
*/
public class Geek1 {
    public static void main (String[] args) throws IOException {

        int[] arr1={1,2,4};

        Stream.of(arr1).collect(Collectors.toList()).sort(x->x);


        BufferedWriter bw=new BufferedWriter(new FileWriter("test.csv"));
        bw.append("1,2");
        bw.append("\n");
        bw.append("3,4");
        bw.close();
        final List<Integer> multiplesOfThree = Arrays.asList(3,6,9,12);
        final List<Integer> evens = Arrays.asList(2,4,6,8,10,12);
        final List<Integer> others1 = new ArrayList<>(multiplesOfThree);
        others1.removeAll(evens);
        others1.stream().forEach(System.out::println);
        //code
//        BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
//
//        int y= Integer.parseInt(br.readLine());
//
//        System.out.println(y);
//
//        for(int i=0;i<y;i++){
//            String x= br.readLine();
//            System.out.println(i+ "__"+x.toLowerCase());
//        }
int k=3780990;
String ks=String.valueOf(k);
String ks1= ks.replaceAll("0","5");
       // System.out.println(Integer.parseInt(ks1));
        for (int i = 0; i < ks.toCharArray().length; i++) { //ks.in
        }


//        Scanner sc=new Scanner(System.in);
//      int y=  sc.nextInt();
//      for (int i=0;i<y;i++) {
//          System.out.println(i+"__" +  sc.next().toLowerCase());;
//      }






//        int t,i;
//        t=Integer.parseInt(String.valueOf(scan.read()));
//        for(i=0;i<=t;i++)
//        {
//            String n=scan.readLine();
//            n=n.toLowerCase();
//            if(i==0) continue;
//
//            System.out.println(n);
//        }
    }

}
