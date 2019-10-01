import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pickingNumbers function below.
    static int pickingNumbers(int[] a) {
        int max=0;
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                int r=map.get(a[i]);
                map.put(a[i],r+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]+1))
            {
                if(map.get(a[i])+map.get(a[i]+1)>max)
                {
                    max=map.get(a[i])+map.get(a[i]+1);
                }
                
            }
            if(map.get(a[i])>max)
                {
                    max=map.get(a[i]);
                }
        }
        if(map.size()==1)
        {
            return a.length;
        }
return max;
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

        int result = pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}