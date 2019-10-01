import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String str="";
        if(s.charAt(8)=='P')
        {
            int r=Integer.parseInt(s.substring(0,2));
            if(r<12)
            {
                r=r+12;
                str=r+s.substring(2,8);
                
            }
            if(r==12)
            {
                str="12"+s.substring(2,8);
            }
        }
        else
        {
            if(Integer.parseInt(s.substring(0,2))<12)
            str=s.substring(0,8);
            else
                str="00"+s.substring(2,8);
        }
return str;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}