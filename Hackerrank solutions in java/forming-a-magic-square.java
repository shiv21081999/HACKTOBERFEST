import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
   return checkMagicSquare(s);

    }
    static int checkMagicSquare(int [][]s)
    {
        int sum1=0,sum2=0;
        int[][] arr1=new int[3][3];
    int[][] arr2=new int[3][3];
    int[][] arr3=new int[3][3];
    int[][] arr4=new int[3][3];
    int[][] arr5=new int[3][3];
    int[][] arr6=new int[3][3];
    int[][] arr7=new int[3][3];
    int[][] arr8=new int[3][3];
        arr1[0][0]=8;arr1[0][1]=1;arr1[0][2]=6;arr1[1][0]=3;arr1[1][1]=5;arr1[1][2]=7;arr1[2][0]=4;arr1[2][1]=9;arr1[2][2]=2; 
            arr2[0][0]=6;arr2[0][1]=1;arr2[0][2]=8;arr2[1][0]=7;arr2[1][1]=5;arr2[1][2]=3;arr2[2][0]=2;arr2[2][1]=9;arr2[2][2]=4; 
            arr3[0][0]=4;arr3[0][1]=9;arr3[0][2]=2;arr3[1][0]=3;arr3[1][1]=5;arr3[1][2]=7;arr3[2][0]=8;arr3[2][1]=1;arr3[2][2]=6; 
            arr4[0][0]=2;arr4[0][1]=9;arr4[0][2]=4;arr4[1][0]=7;arr4[1][1]=5;arr4[1][2]=3;arr4[2][0]=6;arr4[2][1]=1;arr4[2][2]=8; 
            arr5[0][0]=8;arr5[0][1]=3;arr5[0][2]=4;arr5[1][0]=1;arr5[1][1]=5;arr5[1][2]=9;arr5[2][0]=6;arr5[2][1]=7;arr5[2][2]=2; 
            arr6[0][0]=4;arr6[0][1]=3;arr6[0][2]=8;arr6[1][0]=9;arr6[1][1]=5;arr6[1][2]=1;arr6[2][0]=2;arr6[2][1]=7;arr6[2][2]=6; 
            arr7[0][0]=6;arr7[0][1]=7;arr7[0][2]=2;arr7[1][0]=1;arr7[1][1]=5;arr7[1][2]=9;arr7[2][0]=8;arr7[2][1]=3;arr7[2][2]=4; 
            arr8[0][0]=2;arr8[0][1]=7;arr8[0][2]=6;arr8[1][0]=9;arr8[1][1]=5;arr8[1][2]=1;arr8[2][0]=4;arr8[2][1]=3;arr8[2][2]=8; 
            
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                if(arr1[i][j]-s[i][j]>=0)
                {
                    sum1=sum1+arr1[i][j]-s[i][j];
                }
                else
                {
                    sum1=sum1-(arr1[i][j]-s[i][j]);
                }
            }
        }
        sum2=sum1;
        sum1=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                if(arr2[i][j]-s[i][j]>=0)
                {
                    sum1=sum1+arr2[i][j]-s[i][j];
                }
                else
                {
                    sum1=sum1-(arr2[i][j]-s[i][j]);
                }
            }
        }
        if(sum1<sum2)
        {
            sum2=sum1;
        }
        sum1=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                if(arr3[i][j]-s[i][j]>=0)
                {
                    sum1=sum1+arr3[i][j]-s[i][j];
                }
                else
                {
                    sum1=sum1-(arr3[i][j]-s[i][j]);
                }
            }
        }
        if(sum1<sum2)
        {
            sum2=sum1;
        }
        sum1=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                if(arr4[i][j]-s[i][j]>=0)
                {
                    sum1=sum1+arr4[i][j]-s[i][j];
                }
                else
                {
                    sum1=sum1-(arr4[i][j]-s[i][j]);
                }
            }
        }
          if(sum1<sum2)
        {
            sum2=sum1;
        }
        sum1=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                if(arr5[i][j]-s[i][j]>=0)
                {
                    sum1=sum1+arr5[i][j]-s[i][j];
                }
                else
                {
                    sum1=sum1-(arr5[i][j]-s[i][j]);
                }
            }
        }
          if(sum1<sum2)
        {
            sum2=sum1;
        }
        sum1=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                if(arr6[i][j]-s[i][j]>=0)
                {
                    sum1=sum1+arr6[i][j]-s[i][j];
                }
                else
                {
                    sum1=sum1-(arr6[i][j]-s[i][j]);
                }
            }
        }
          if(sum1<sum2)
        {
            sum2=sum1;
        }
        sum1=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                if(arr7[i][j]-s[i][j]>=0)
                {
                    sum1=sum1+arr7[i][j]-s[i][j];
                }
                else
                {
                    sum1=sum1-(arr7[i][j]-s[i][j]);
                }
            }
        }
          if(sum1<sum2)
        {
            sum2=sum1;
        }
        sum1=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                if(arr8[i][j]-s[i][j]>=0)
                {
                    sum1=sum1+arr8[i][j]-s[i][j];
                }
                else
                {
                    sum1=sum1-(arr8[i][j]-s[i][j]);
                }
            }
        }
          if(sum1<sum2)
        {
            sum2=sum1;
        }
        return sum2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}