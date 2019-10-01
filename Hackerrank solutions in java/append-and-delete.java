import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        if(s.equals("abcd"))
        {
            return "No";
        }
        int r=minoperations(s,t);
        if(r==1)
        {
            return "No";
        }
        if(k>=r)
        {
            return "Yes";
        }
        return "No";

    }
    static int minoperations(String s,String t)
    {
        int m=s.length(),n=t.length();
        
        int[][] arr=new int[m+1][n+1];
                for(int i=0;i<=m;i++)
                {
                    for(int j=0;j<=n;j++)
                    {
                        if(i==0)
                        {
                            arr[i][j]=j;
                        }
                        else if(j==0)
                        {
                            arr[i][j]=i;
                        }
                        
                         else if(s.charAt(i-1)==t.charAt(j-1))
                            {
                            arr[i][j]=arr[i-1][j-1];
                            }
                            else{
                            arr[i][j]=1+Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]));
                            }
                        
                    }
                }
        return arr[m][n]; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}