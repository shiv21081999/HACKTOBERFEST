import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
        String[] ans=new String[grid.length];
        ans[0]=grid[0];
        ans[ans.length-1]=grid[grid.length-1];
        for(int i=1;i<ans.length-1;i++)
        {
            ans[i]="";
        }
        for(int i=1;i<grid.length-1;i++)
        {
            ans[i]+=grid[i].charAt(0);
            for(int j=1;j<grid[i].length()-1;j++)
            {
                char n=grid[i].charAt(j);
                if(grid[i-1].charAt(j)<n && grid[i+1].charAt(j)<n && grid[i].charAt(j-1)<n && grid[i].charAt(j+1)<n){
                    ans[i]+="X";
                }
                else
                {
                    ans[i]+=grid[i].charAt(j);
                }
            }
            ans[i]+=grid[i].charAt(grid[i].length()-1);
        }
        
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}