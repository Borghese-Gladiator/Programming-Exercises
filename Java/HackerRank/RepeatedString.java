import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        //repeat string
        //String repeatStr = repeatString(s, n);
        //count occurrences of a
        int numAInS = findNumA(s), ans = 0;
        //number of times string repeats within 0 to given value
        long repeatNum = n / s.length();
        //the leftover substring after removing the number of times the string repeats
        long numPlaces = n - (s.length() * repeatNum);
        ans += numAInS * repeatNum;
        ans += findNumA(s.substring(0, (int) numPlaces));
        return ans;
    }
    static int findNumA(String s) {
        if (s.equals("a")) {
            return 1;
        }
        int numA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                numA++;
            }
        }
        return numA;
    }
    static String repeatString(String s, long n) {
        String repeat = "";
        for (long i = 0; i < n; i++) {
            repeat += s;
        }
        return repeat;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
