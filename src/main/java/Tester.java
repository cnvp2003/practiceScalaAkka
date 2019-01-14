
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Tester {

    /**
     * Complete the function below.
     * DO NOT MODIFY anything outside this method.
     */
    static boolean[] twins(String[] a, String[] b) {
        boolean[] result = new boolean[a.length];
        for(int i=0; i < a.length; i++){

            String evenSwap = SwapEven(a[i]);
            String oddSwap = SwapOdd(evenSwap);

            if (evenSwap.equals(b[i])){
                result[i] = true;
            }
            if(oddSwap.equals(b[i])){
                result[i] = true;
            }

        }
        return result;
    }

    static String SwapEven(String a){
        char[] even = a.toCharArray();
        for(int i=0; i<a.length();i=i+2){
            int increment = i+2;
            if(increment < a.length()) {
                char tmp = even[i];
                even[i] = even[i + 2];
                even[i + 2] = tmp;
            }
        }
        return String.valueOf(even);
    }

    static String SwapOdd(String b){
        char[] odd = b.toCharArray();
        for(int i=1; i<b.length();i=i+2){
            int increment = i+2;
            if(increment < b.length()) {
                char tmp = odd[i];
                odd[i] = odd[i + 2];
                odd[i + 2] = tmp;
            }
        }
        return String.valueOf(odd);
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine().trim());
        String[] a = new String[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextLine();
        }
        System.out.println("aaa "+a);

        int m = Integer.parseInt(in.nextLine().trim());
        String[] b = new String[m];
        for(int i = 0; i < m; i++) {
            b[i] = in.nextLine();
        }

        System.out.println("abb "+b);

        // call twins function
        boolean[] results = twins(a, b);

        for(int i = 0; i < results.length; i++) {
            System.out.println(results[i]? "Yes" : "No");
        }
    }
}