import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        String str="";
                    for(int i=0;i<s.length();i++)
                    {
                        if(s.charAt(i)!=' ')
                        {
                            str=str+s.charAt(i);
                        }
                    }
        double r=str.length();
        int m=(int)Math.sqrt(r);
         String ans=""; 
        if(m*m==str.length())
        {
             for(int i=0;i<m;i++)
                    {
                        for(int j=i;j<str.length();j=j+m)
                        {
                            ans=ans+str.charAt(j);
                        }
                        ans=ans+" ";
                    }
        }
        else
                    {for(int i=0;i<=m;i++)
                    {
                        for(int j=i;j<str.length();j=j+m+1)
                        {
                            ans=ans+str.charAt(j);
                        }
                        ans=ans+" ";
                    }}
        
return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}