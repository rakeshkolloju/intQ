import java.util.*;
import java.util.stream.Stream;

public class IntQ1 {

    public static void main(String[] args) {
        System.out.println("Hello");
        String str="Helko World";

        String str1= str.substring(0);
        System.out.println(str1);
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};

        List<String> t=new ArrayList<>();

        Object[] strings = IntQ1.mergeNames(names1, names2);
        for (Object o :strings
        ) {
            System.out.println(o.toString());

        }
        // Stream.of(strings).forEach(System.out::println);
        //0 Bolivia
        //1 -1
        //2 -1
        //3 Cuba
        //4 China
        //5 Cuba
        //6 Argentina
        //7 Bolivia
        //8 China
        //9 -1
        //        Scanner scanner = new Scanner(System.in);
        //        String str = "";
        //        while (!scanner.next().equalsIgnoreCase("exit") && scanner.hasNextLine()) {
        //
        //            str += scanner.nextLine() + ",";
        //        }
        //        str = str.substring(0, str.length() - 1);
        //        System.out.println("str:" + str);
        //
        //        String array[] = str.split(",");
        //
        //
        //        solve(array);

        //     test2(Optional.ofNullable(null));
        //        String  res="13 Loaded successfully out of 133";
        //        String[] s = res.split(" ");
        //
        //        if(s[0].equals(s[s.length - 1]))
        //            System.out.println("Success");

        // write your code here

        //        Scanner scanner=new Scanner(System.in);
        //        String s = scanner.next();
        //        System.out.println("args = " + Arrays.deepToString(args));

        // test1();
    }



    public static Object[] mergeNames(String[] str1,String[] str2){

        return Stream.of(str1, str2).flatMap(values -> Stream.of(values)).distinct().toArray();



    }
    public static void solve(String[] array) {
        Map<String, Integer> kv = new HashMap<>();
        for (String s : array) {
            if (!s.trim().equals("-1")) {
                if (!kv.containsKey(s))
                    kv.put(s, 1);
                else
                    kv.put(s, kv.get(s) + 1);
            }
        }
        var sorted = new TreeMap<String, Integer>(kv);

        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println(entry.getKey() +
                    "," + entry.getValue());


    }

    public static void test2(Optional<String> s) {

        System.out.println(s.orElseGet(() -> "test"));
    }

    private static void test1() {
        int[] arr = {1, 2, 3, 3, 4, 4};
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    System.out.println(arr[i]);
                }


            }
        }

        String str = "stress";

        HashSet<Character> dict = new HashSet<>();
        for (int i = 0; i < str.toCharArray().length; i++) {
            if (!dict.contains(str.charAt(i))) {
                dict.add(str.charAt(i));
            }
        }
    }


}
