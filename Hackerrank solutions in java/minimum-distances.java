import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
                for(int i=0;i<a.length;i++)
                {
                    if(map.containsKey(a[i]))
                    {
                        int r=map.get(a[i]);
                        if(i<r)
                        {
                            map.put(a[i],i);
                        }
                    }
                    else
                    {
                        map.put(a[i],i);
                    }
                }
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                if(i!=map.get(a[i]))
                {
                    if(Math.abs(map.get(a[i])-i)<min)
                    {
                        min=Math.abs(map.get(a[i])-i);
                    }
                }
            }
        }
        if(min==Integer.MAX_VALUE)
        {
            return -1;
        }
        return min;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}