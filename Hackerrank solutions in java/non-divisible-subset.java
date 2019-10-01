import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the nonDivisibleSubset function below.
    static int nonDivisibleSubset(int k, int[] arr) {
            int[] modulus=new int[k];
        for(int i=0;i<arr.length;i++)
        {
            int bucket=arr[i]%k;
            modulus[bucket]+=1;
        }
        int nonDivisibleSubsetCardinality=0;
        nonDivisibleSubsetCardinality += (modulus[0] >= 1) ? 1 : 0;
        nonDivisibleSubsetCardinality += (k%2 == 0 && modulus[k/2] >= 1) ? 1 : 0;
        int maxBuckets = 0;
        if(k%2 == 0)
        {
            maxBuckets = (k/2)-1;
        }
        else
        {
            maxBuckets = k/2;
        }
        
        //Picks the biggest bucket of each pair for each even sum group
        for(int i = 1; i <= maxBuckets; i++)
        {
            nonDivisibleSubsetCardinality += Math.max(modulus[i], modulus[k-i]);
        }
        return nonDivisibleSubsetCardinality;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] S = new int[n];

        String[] SItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int SItem = Integer.parseInt(SItems[i]);
            S[i] = SItem;
        }

        int result = nonDivisibleSubset(k, S);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}