import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
            int n=s.nextInt(); 
    
        int evensum=0;
        int oddsum=0;
        
        while(n!=0)
        {
            int digit =n%10;
            if(digit%2==0)
           evensum=evensum+digit;
           // System.out.println(sum);
        
           else
                oddsum=oddsum+digit;
            n=n/10;
        }
                System.out.println(evensum +"  "+oddsum);

	}
}
