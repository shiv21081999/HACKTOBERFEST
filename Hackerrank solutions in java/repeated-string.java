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
        long ans=0,i=0;int count=0;
  for(int j=0;j<s.length();j++)
  {
      if(s.charAt(j)=='a')
      {
          count++;
      }
  }
        if(count==0)
        {
            return 0;
        }
                long m=n/s.length();
        long r=n-(m*s.length());
        ans=m*count;
        if(r==0)
        {
            return m*count;
        }
        else{
            for(int j=0;j<r;j++)
            {
                if(s.charAt(j)=='a')
                {
                    ans=ans+1;
                }
            }
            return ans;
        }
        

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