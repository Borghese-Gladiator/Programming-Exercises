import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    //6x6 has 16 hourglasses
    static int hourglassSum(int[][] arr) {
        //arr[0][0] arr[0][1] arr[0][2]
        //arr[1][1]
        //arr[2][0] arr[2][1] arr[2][2]
        //find all hourglasses
        //ArrayList of the sums
        //find greatest sum
        List<Integer> allSums = new ArrayList<Integer>();
        int finalSum = -999;
        for (int i = 0; i < arr.length - 2; i++) {
            for(int j = 0; j < arr[i].length - 2; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                    + arr[i + 1][j + 1]
                    + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                allSums.add(sum);
            }
        }
        for (Integer a: allSums) {
            if (a > finalSum) {
                finalSum = a;
            }
        }
        return finalSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
