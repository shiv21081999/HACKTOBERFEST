import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        int count1=0,count2=0,k=0,j=0;int[] ans=new int[1];
        ArrayList<Integer> arraylist=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            arraylist.add(arr[i]);
        }
        while(!arraylist.isEmpty())
        {
            int num=getmin(arraylist);
            count1=0;
            j=0;
            while(j<arraylist.size())
            {
                if(arraylist.get(j)==num)
                {
                    count1++;
                    arraylist.remove(j);
                }
                else{
                    arraylist.set(j,arraylist.get(j)-num);
                    j++;
                }
            }
            ans[k++]=arraylist.size()+count1;
            int[] temp=ans;
            ans=new int[temp.length+1];
            for(int m=0;m<temp.length;m++)
            {
                ans[m]=temp[m];
            }
        }
        int[] temp=ans;
        ans=new int[temp.length-1];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=temp[i];
        }
        return ans;

    }
static int getmin(ArrayList<Integer> arr)
{
    int min=arr.get(0);
    for(int i=0;i<arr.size();i++)
    {
        if(arr.get(i)<min)
        {
            min=arr.get(i);
        }
    }
    return min;
}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}