import java.util.Scanner;

public class PrimeFactor {
    public static boolean check(int num)
    {
        if(num<=1)
        {
            return false;
        }
        else if(num==2 || num==3){
            return true;
        }
        else if(num%2==0 || num%3==0)
        {
            return false;
        }
        for(int i=5;i<=Math.sqrt(num);i+=2)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void prime(int n)
    {
        if(check(n))
            System.out.println(n);
        for(int j=1;j<n;j++)
        {
            if(n%j==0 && check(j)){
                System.out.print(j+" ");

            }
        }    
    }
    public static void main(String[] args) {
        int a=0;
        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            a=s.nextInt();
            prime(a);
        }
    }
}
