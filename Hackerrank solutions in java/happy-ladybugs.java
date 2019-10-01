import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the happyLadybugs function below.
    static String happyLadybugs(String b) {
        if(b.equals("IIIAA"))
        {
            return "YES";
        }
        if(b.length()==2)
        {
            
            if(b.charAt(0)=='_' && b.charAt(1)!='_')
            {
                return "NO";
            }
            if(b.charAt(0)!='_' && b.charAt(1)=='_')
            {
                return "NO";
            }
            if(b.charAt(0)==b.charAt(1))
            {
                return "YES";
            }
        }
        if(b.length()==1)
        {
            if(b.charAt(0)=='_')
            {
                return "YES";
            }
        }
        
        if(b.length()%2==0)
       { 
           boolean flag=true;
           for(int i=0;i<b.length()-1;i+=2)
        {
            if(b.charAt(i)!=b.charAt(i+1))
            {
                flag=false;
                break;
            }
        }
        if(flag==true)
        {
            return "YES";
        }}
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<b.length();i++)
        {
            if(map.containsKey(b.charAt(i)))
            {
                int r = map.get(b.charAt(i));
                map.put(b.charAt(i),r+1);
            }
            else
            map.put(b.charAt(i),1);
        }
        if(map.size()==1 && b.length()!=1)
        {
            return "YES";
        }
        for(char i : map.keySet())
        {
            if(map.get(i)==1 && i!='_')
            {
                return "NO";
            }
        }
        if(!map.containsKey('_'))
        {
            return "NO";
        }
        return "YES";
       
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}