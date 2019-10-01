import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r, int c, int[][] obstacles) {
           HashMap<Integer,int[]> map=new HashMap<>();
           for(int i=0;i<obstacles.length;i++)
           {
               if(map.containsKey(obstacles[i][0]))
               {
                   int[] arr=map.get(obstacles[i][0]);
                   int[] temp= new int[arr.length+1];
                   temp[0]=obstacles[i][1];
                   for(int j=0;j<arr.length;j++)
                   {
                       temp[j+1]=arr[j];
                   }
                   map.put(obstacles[i][0], temp);
               }
               else
               {
                   int[] arr= {obstacles[i][1]}; 
               
               map.put(obstacles[i][0],arr);
               }
           }
            return queenattack1(map,n,r,c);
        }
        static int queenattack1(HashMap<Integer,int[]> map,int n,int r,int c){
            int count=0;
            int i=r+1,j=c+1;
            while(i<=n && j<=n)
                {
                boolean flag=true;
                
                    if(map.containsKey(i))
                    {
                        int[] arr=map.get(i);
                        for(int k=0;k<arr.length;k++)
                        {
                            if(arr[k]==j)
                            {    
                                flag=false;
                                break;
                            }
                        }
                        
                    }
                    if(flag==true)
                    {
                        count++;
                    }
                    else if(flag==false)
                    {
                        break;
                    }
                    i++;j++;
                }
            
            i=r-1;j=c-1;
            while(i>=1 && j>=1)
                {
                boolean flag=true;
                
                if(map.containsKey(i))
                {
                    int[] arr=map.get(i);
                    for(int k=0;k<arr.length;k++)
                    {
                        if(arr[k]==j)
                        {    
                            flag=false;
                            break;
                        }
                    }
                    
                }
                    if(flag==true)
                    {
                        count++;
                    }
                    else if(flag==false)
                    {
                        break;
                    }
                    i--;j--;
                }
            
            i=r-1;j=c+1;
            while(i>=1 && j<=n)
                {
                boolean flag=true;
                
                if(map.containsKey(i))
                {
                    int[] arr=map.get(i);
                    for(int k=0;k<arr.length;k++)
                    {
                        if(arr[k]==j)
                        {    
                            flag=false;
                            break;
                        }
                    }
                    
                }
                     if(flag==true)
                    {
                        count++;
                    }
                    else if(flag==false)
                    {
                        break;
                    }
                    i--;j++;
                }
            
            i=r+1;j=c-1;
            while(i<=n && j>=1)
                {
                boolean flag=true;
                
                if(map.containsKey(i))
                {
                    int[] arr=map.get(i);
                    for(int k=0;k<arr.length;k++)
                    {
                        if(arr[k]==j)
                        {    
                            flag=false;
                            break;
                        }
                    }
                    
                }
                    if(flag==true)
                    {
                        count++;
                    }
                    else if(flag==false)
                    {
                        break;
                    }
                        i++;j--;
                }
            
            for(i=r+1;i<=n;i++)
            {
                boolean flag=true;
                
                if(map.containsKey(i))
                {
                    int[] arr=map.get(i);
                    for(int k=0;k<arr.length;k++)
                    {
                        if(arr[k]==c)
                        {    
                            flag=false;
                            break;
                        }
                    }
                    
                }
                if(flag==true)
                {
                    count++;
                }
                else if(flag==false)
                    {
                        break;
                    }
            }
            for(i=r-1;i>=1;i--)
            {
                boolean flag=true;
                
                if(map.containsKey(i))
                {
                    int[] arr=map.get(i);
                    for(int k=0;k<arr.length;k++)
                    {
                        if(arr[k]==c)
                        {    
                            flag=false;
                            break;
                        }
                    }
                    
                }
                if(flag){
                    count++;
                }
                else if(flag==false)
                    {
                        break;
                    }
            }
            for(i=c+1;i<=n;i++)
            {
                boolean flag=true;
                
                if(map.containsKey(r))
                {
                    int[] arr=map.get(r);
                    for(int k=0;k<arr.length;k++)
                    {
                        if(arr[k]==i)
                        {    
                            flag=false;
                            break;
                        }
                    }
                    
                }
                if(flag){
                    count++;
                }
                else if(flag==false)
                    {
                        break;
                    }
            }
            for(i=c-1;i>=1;i--)
            {
                boolean flag=true;
                
                if(map.containsKey(r))
                {
                    int[] arr=map.get(r);
                    for(int k=0;k<arr.length;k++)
                    {
                        if(arr[k]==i)
                        {    
                            flag=false;
                            break;
                        }
                    }
                    
                }
                if(flag){
                    count++;
                }
                else if(flag==false)
                    {
                        break;
                    }
            }
        return count;
        }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}