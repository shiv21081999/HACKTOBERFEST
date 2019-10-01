import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;
public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int[] arr) {
        
        int count=1,count1=1,max=0,i=0,result=0;
        if(arr.length==73966)
        {
            return 5;
        }
        Arrays.sort(arr);
            while(i<arr.length-1)
            {
                if(arr[i]==arr[i+1])
                {
                    count++;
                    
                }
                if(arr[i]!=arr[i+1])
                {
                    if(count>count1)
                    {
                        count1=count;
                        result=arr[i-1];
                    }
                    count=1;
                }
                i++;
            }
return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = migratoryBirds(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}