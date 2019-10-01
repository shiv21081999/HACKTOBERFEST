import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
      
            char[] arr=new char[w.length()];int max=Integer.MIN_VALUE;int n=arr.length;
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=w.charAt(i);
                if(arr[i]>max)
                {
                    max=arr[i]; 
                }
            }
            String str="";
            int c1=0,c2=0;
            for(int i=1;i<w.length();i++)
            {
                if(arr[i-1]<arr[i])
                {
                    if(i>c1)
                    {
                        c1=i;
                    }
                }
            }
            if(c1==0)
            {
                return "no answer";
            }
            for(int i=c1;i<w.length();i++)
            {
                if(arr[c1-1]<arr[i])
                {
                    c2=i;
                }
            }
            char temp=arr[c1-1];
            arr[c1-1]=arr[c2];
            arr[c2]=temp;
            int left=c1;
            int right=w.length()-1;
            while(left<right)
            {
                temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
                right--;
            }
            for(int i=0;i<arr.length;i++)
            {
                str=str+arr[i];
            }
            return str;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}