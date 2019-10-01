import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        boolean flag=true;
        int n=s.length();
        String s1="";
        for(int i=0;i<n;i++)
        {
            s1=s.charAt(i)+s1;
        }
        for(int i=0;i<n-1;i++)
        {
            int n1=s.charAt(i);
            int n2=s.charAt(i+1);
            int n3=s1.charAt(i);
            int n4=s1.charAt(i+1);
          if(Math.abs(n1-n2)!=Math.abs(n3-n4))
                flag=false;
        }
        if(flag==true)
            return "Funny";
        else
            return "Not Funny";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}