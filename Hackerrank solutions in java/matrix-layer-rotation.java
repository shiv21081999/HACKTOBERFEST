import java.util.Scanner;
public class Solution
{
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    int m=s.nextInt();
    int n=s.nextInt();
    int r=s.nextInt();
    int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
    int rs=0,re=m-1,cs=0,ce=n-1;
    int t=Math.min(m,n)/2;int x=0;
            while(x<t)
            {
                for(int i=0;i<r%(2*(m + n - 4*x) - 4);i++)
                {
                    int key=arr[rs][cs];
                    for(int j=cs;j<=ce-1;j++)
                    {
                        arr[rs][j]=arr[rs][j+1];
                    }
                    
                    int key1=arr[re][cs];
                    for(int j=re;j>rs+1;j--)
                    {
                        arr[j][cs]=arr[j-1][cs];
                    }
                    int key2=arr[re][ce];
                    for(int j=ce;j>cs+1;j--)
                    {
                        arr[re][j]=arr[re][j-1];
                    }
                    for(int j=rs;j<re-1;j++)
                    {
                        arr[j][ce]=arr[j+1][ce];
                    }
                    arr[rs+1][cs]=key;
                    arr[re][cs+1]=key1;
                    arr[re-1][ce]=key2;

                }
                rs++;
                re--;
                cs++;
                ce--;
                x++;
            }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
}

}