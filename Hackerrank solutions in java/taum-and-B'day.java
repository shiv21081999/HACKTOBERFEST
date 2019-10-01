import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the taumBday function below.
    static long taumBday(long b, long w, long bc, long wc, long z) {
            
        if(Math.abs(bc-wc)>z)
        {
            
            if(bc>wc)
            {
                
                return Math.min((((wc+z)*b)+(wc*w)),((wc*w)+(bc*b)));
            }
            if(wc>bc)
            {
                return Math.min((((bc+z)*w)+(bc*b)),((wc*w)+(bc*b)));
            }
        }
        return ((wc*w)+(bc*b));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] bw = scanner.nextLine().split(" ");

            long b = Integer.parseInt(bw[0]);

            long w = Integer.parseInt(bw[1]);

            String[] bcWcz = scanner.nextLine().split(" ");

            long bc = Integer.parseInt(bcWcz[0]);

            long wc = Integer.parseInt(bcWcz[1]);

            long z = Integer.parseInt(bcWcz[2]);

            long result = taumBday(b, w, bc, wc, z);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}