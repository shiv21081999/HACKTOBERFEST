import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String str="";    
        if(m==0)
            {
                str=str+mapping(h)+" o' clock";
            }
            else if(m==15)
            {
                str=str+"quarter past "+mapping(h);
            }
        else if(m==30)
        {
            str=str+"half past "+mapping(h);
        }
        else if(m==45)
        {
            if(h!=12)
            {
                str=str+"quarter to "+mapping(h+1);
            }
            else{
                str=str+"quarter to 1";
            }
        }
        else 
        {
            
            if(m<30)
            {
                if(m==1)
            {
                str=str+"one minute past "+mapping(h);
            }
                else
                {
                    str=str+mapping(m)+" minutes past "+mapping(h);
                }
            }
            else{
                if(h!=12)
                {
                    str=str+mapping(60-m)+" minutes to "+mapping(h+1);
                }
                else{
                    str=str+mapping(60-m)+" minutes to 1";
                }
            }
            
        }
        return str;
    }
    static String mapping(int num){
        String[] arr={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
        return arr[num-1];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}