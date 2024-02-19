import java.util.Scanner;
public class PrimeNumber {
    public static void CheckPrime(int n)
    {
        int c=0;
        for(int i=2;i<n-1;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.println(n+" It is a prime Number");
        }
        else 
        {
            System.out.println(n+" It is not aprime Number");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        CheckPrime(n);
    }
}
