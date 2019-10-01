import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
 int count=0;           
        for(long i=p;i<=q;i++)
                    {
                        if(i==1)
                        {
                            System.out.print("1 ");
                            count++;
                            continue;
                        }
                        String ans="";
                        long r=i*i;
                       
                        while(r>0)
                        {
                           
                            long x=r%10;
                            ans=x+ans;
                            r=r/10;
                        }
                        int d=ans.length();
                        if(d>1)
                        {
                            String str1=ans.substring(0,d/2);
                        String str2=ans.substring(d/2);
                        int l=Integer.parseInt(str1);
                        int m=Integer.parseInt(str2);
                        if(l+m==i)
                        {
                            System.out.print(i+" ");
                            count++;
                        }
                        }
                        
                    }
        if(count==0)
        {
            System.out.print("INVALID RANGE");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}