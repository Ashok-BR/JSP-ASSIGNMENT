import java.util.Scanner;

public class PrimeWithinRange {
    public static void print(int start, int end)
    {
        for(int i=start;i<=end;i++)
        {
            if(check(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean check(int n)
    {
        if(n==1)
        {
            return false;
        }
        else if(n==2)
        {
            return true;
        }
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.println("Enter starting point");
            int a=s.nextInt();
            System.out.println("Enter Ending point");
            int b=s.nextInt();
            print(a, b);
            
        }
    }
    
}
