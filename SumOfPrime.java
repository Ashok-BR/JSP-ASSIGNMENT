import java.util.Scanner;

public class SumOfPrime {
    public static void SumPrime( int start , int end)
    {
        int count =0;
        for(int i=start ; i<=end ; i++ )
        {
            if(check(i))
            {
                System.out.print(i+" ");
                count+=i;
            }
        }
        System.out.println(" ");
        System.out.println("Sum is: "+count);

    }
    public static boolean check(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else if(n==2 || n==3)
        {
            return true;
        }
        else if(n % 2 == 0 || n % 3 == 0)
        {
            return false;
        }
        for(int i=5;i<Math.sqrt(n);i+=2)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (true) {
        System.out.println("Enter starting no.");
        int a=s.nextInt();
        System.out.println("Enter Ending no.");
        int b=s.nextInt();
        System.out.println("Prime Numbers are...");
        SumPrime(a, b);
        }
    }
    
}
