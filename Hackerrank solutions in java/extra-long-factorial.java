import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
int[] arr=new int[500];
        arr[0]=1;
        int length=1;
        for(int i=2;i<=n;i++)
        {
            length=multiply(arr,i,length);
        }
        for(int i=length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
    static int multiply(int[] arr,int x,int length){
        int carry=0;
        for(int i=0;i<length;i++)
        {
            int prod=arr[i]*x+carry;
            arr[i]=prod%10;
            carry=prod/10;
        }
        while(carry!=0)
        {
            arr[length]=carry%10;
            carry=carry/10;
            length++;
        }
        return length;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}