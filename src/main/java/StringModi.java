import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StringModi {
    private static final String WORD_SEPARATOR = " ";

    public static void main(String[] args) throws FileNotFoundException {


        String sent="How are you";

        String[] s = sent.split(" ");
        for (String s1:s) {


        }

        char[] x= new char[]{'b','c','a','d'};

        Arrays.sort(x);
        for (int i = 0; i < x.length; i++) {
            System.out.println("args = " +x[i]);
        }

        String[] strArray = {
                "   Hello World",
                "Hello World   ",
                "  Hello          World  "
        };

        for(String string : strArray){
            System.out.println( string.trim().replaceAll("\\s+", " ") );
        }
       //  pro();
//        String x=  " Rice    Extract ";
//
//        String capitalize = StringUtils.capitalize("ARIDOL");
//        System.out.println("=====");
//        System.out.println(convertToTitleCaseSplitting(toOneSpaceString(" Rice   EXtract ")));
//
//        //        System.out.println("===========");
////        System.out.println(new String(" hello   there   ").trim().replaceAll("\\s{6}", " ").trim());
//
        List<String> stringList = Arrays.asList("Ritalin ER", "ARIDOL", "Aphenol-40","Rice   Extract"," Rice       Extract",
                "_drug preparation kit "," L-Carnosine","Alpha-gpc");
        String temp="";
        for (String str:stringList) {
            System.out.println(convertToTitleCaseSplitting((str)));

        }
    }
    public static String reversed(String str){
        char[] chars= str.toCharArray();
        char[] revChars=new
        for (char c:chars) {

        }
        return new String();
    }
    public static void pro() throws FileNotFoundException {
        // java.io.InputStream
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream("/test1.csv");
        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);

        BufferedReader br = new BufferedReader(streamReader);

        List<String> collect = br.lines()
                .skip(1)
                .map(x -> x.split(",")[0] + "______" + x.split(",")[1])
                .collect(toList());

        for (String x:collect
             ) {
            System.out.println(x);

        }

    }

    public static String convertToTitleCaseSplitting(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        text=text.trim().replaceAll("_","").trim().replaceAll("\\s+", " ");
        return Arrays
                .stream(text.split(WORD_SEPARATOR))
                .map(word -> {
                    if (word.isEmpty())
                        return word;
                    if (word.length()==2) return word;
                    return Character.toTitleCase(word.charAt(0)) + word.substring(1).toLowerCase();
                })
                .collect(Collectors.joining(WORD_SEPARATOR));
    }
    public static String toDisplayCase(String s) {

        final String ACTIONABLE_DELIMITERS = " '-/"; // these cause the character following
        // to be capitalized

        StringBuilder sb = new StringBuilder();
        boolean capNext = true;

        for (char c : s.toCharArray()) {
            c = (capNext)
                    ? Character.toUpperCase(c)
                    : Character.toLowerCase(c);
            sb.append(c);
            capNext = (ACTIONABLE_DELIMITERS.indexOf(c) >= 0); // explicit cast not needed
        }
        return sb.toString();
    }

     public static String toOneSpaceString(String str){

         StringTokenizer st = new StringTokenizer(str, WORD_SEPARATOR);
         StringBuilder sb = new StringBuilder();
         while(st.hasMoreElements()){
             sb.append(st.nextElement()).append(" ");
         }
        return (sb.toString().trim());
     }
}
